package com.assignments.java8Feature.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StateCityTest {
	public static void main(String[] args) {
		List<CityName> cs=Arrays.asList(
				new CityName(1, "pune", new State(101, "maharashtra"), 9.5f, 500000, 493),
				new CityName(2, "nagpur", new State(101, "maharashtra"), 7.7f, 400000, 393),
				new CityName(3, "hydrabad", new State(102, "telangana"), 5.8f, 350000, 450),
				new CityName(4, "karimnagar", new State(102, "telangana"), 8f, 650000, 350),
				new CityName(5, "patna", new State(103, "bihar"), 6f, 450000, 500),
				new CityName(6, "gaya", new State(103, "bihar"), 8.6f, 600000, 300)
				);
		//1. WAP to find the city with less area and highest population
//		System.out.println("find city with less area and highest population");
//		List<CityName> value=cs.stream()
//							   .sorted(Comparator.comparing(CityName::getPopulation)
//							   .thenComparing(CityName::getArea_of_city).reversed())
//							   .limit(1)
//							   .collect(Collectors.toList());
//		System.out.println(value);
		
		//2. WAP to find the city with high pollution_index and high city area. 
		List<CityName> list = cs.stream()
								.sorted(Comparator.comparing(CityName::getPollutionIndex)
								.thenComparing(CityName::getArea_of_city).reversed())
								.limit(1)
								.collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println("==================================");
		//3. WAP to print the city detail on the basis of lowest pollution_index first and so on.
		
		List<CityName> list2 = cs.stream()
								 .sorted(Comparator.comparingDouble(CityName::getPollutionIndex))
								 .collect(Collectors.toList());
		
		for (CityName cityDetails : list2) {
			System.out.println(cityDetails);
		}
		
		//4. WAP to print city with lowest pollution index and lowest area of city.
		System.out.println("========================================");
		
		List<CityName> list1 = cs.stream()
				.sorted(Comparator.comparing(CityName::getPollutionIndex)
				.thenComparing(CityName::getArea_of_city))
				.limit(1)
				.collect(Collectors.toList());
		System.out.println(list1);
		
		//5. WAP to count how many cities in every state we are having.
		System.out.println("========================================");
		Map<String,Long> map = cs.stream()
								 .collect(Collectors.groupingBy(n->n.getObjState().getStateName(),Collectors.counting()));
		for (String c : map.keySet()) {
			System.out.println("In "+ c +" state,total no of cities are : "+map.get(c));
		}
		
		
		//6. WAP to print total area of each state.
		System.out.println("========================================");
		
		cs.stream().map(n->n.getCityname()+" : "+n.getArea_of_city()).forEach(System.out::println);
		
		Map<String,Integer> map2 = cs.stream()
									 .collect(Collectors.groupingBy(s->s.getObjState().getStateName(),Collectors.summingInt(CityName::getArea_of_city)));
		for (String state : map2.keySet()) {
			System.out.println("Total area of  "+state+" state is :-"+map2.get(state));
		}
		}

}
