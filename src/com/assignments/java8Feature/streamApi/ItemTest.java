package com.assignments.java8Feature.streamApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemTest {

	public static void main(String[] args) {
		List<StreamItem> itemlist = new ArrayList<>();

		itemlist.add(new StreamItem(101, "parle", LocalDateTime.of(2022, 4, 23, 4, 30),
				LocalDateTime.of(2023, 4, 23, 4, 30), 2000));
		itemlist.add(new StreamItem(102, "sunfist", LocalDateTime.of(2020, 5, 20, 8, 00),
				LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
		itemlist.add(new StreamItem(103, "monaco", LocalDateTime.of(2021, 7, 21, 7, 20),
				LocalDateTime.of(2022, 7, 21, 7, 20), 8000));
		itemlist.add(new StreamItem(104, "borbon", LocalDateTime.of(2019, 9, 12, 6, 37),
				LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		itemlist.add(new StreamItem(105, "dairymilk", LocalDateTime.of(2019, 9, 12, 6, 37),
				null, 3000));
		itemlist.add(new StreamItem(106, "water bottal", LocalDateTime.of(2019, 9, 12, 6, 37), null, 10000));

		// . WAP to find the average price of item from the list of given items.

		Double avgPrice = itemlist.stream()
								  .collect(Collectors.averagingDouble(StreamItem::getPrice));
		System.out.println("Average price of Item from all Item is :" + avgPrice);
		
		System.out.println("===============================");
		
		// WAP to print detail of item which is having highest and lowest price.
		// (separate programs should be used

		Optional<StreamItem> maxPrice = itemlist.stream()
												.collect(Collectors.maxBy(Comparator.comparingDouble(StreamItem::getPrice)));

		System.out.println("Item which has highest price is :" + maxPrice.get());
		System.out.println("===============================");
		
		Optional<StreamItem> minPrice = itemlist.stream()
												.collect(Collectors.minBy(Comparator.comparingDouble(StreamItem::getPrice)));

		System.out.println("Item which has lowest price is :" + minPrice.get());
		
		System.out.println("===============================");
		
		// WAP to print the item with maximum price and not having any expiry 
		// date(item like water bottle, and dresses not having any expiry date)
		
		
		Optional<StreamItem> collect = itemlist.stream()
											   .filter(i->i.getDate_of_expiry()==null)
											   .collect(Collectors.maxBy(Comparator.comparingDouble(StreamItem::getPrice)));
		System.out.println(collect.get());
		
		System.out.println("===============================");
		// WAP to store item name and price from list to set.
		
		Map<String,Map<Float,List<StreamItem>>> map = itemlist.stream().collect(Collectors.groupingBy(e->e.getItemName(),Collectors.groupingBy(p->p.getPrice())));
		
		Set<String> set = itemlist.stream()
								  .map(e->e.getItemName()+" price is : "+e.getPrice())
								  .collect(Collectors.toSet());
		for (String item : set) {
			System.out.println(item);
		}
		
		// . WAP to remove duplicate prices from the list of the items.
		System.out.println("===============================");
		System.out.println("List after removing duplicate price:");
		itemlist.stream()
				.map(p->p.getPrice())
				.distinct()
				.forEach(System.out::println);

	//itemlist.stream().collect(Collectors.toList()).forEach(System.out::println);
	

	}
}
