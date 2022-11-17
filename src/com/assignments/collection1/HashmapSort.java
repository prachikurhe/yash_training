package com.assignments.collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*6) WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.
*/
public class HashmapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("Pune", 100000);
		map.put("Nashik", 200000);
		map.put("Solapur", 300000);
		map.put("Nagpur", 400000);
		map.put("Ahmednagar", 600000);
		map.put("Lonavala", 500000);
		Map<String,Integer>map1=new TreeMap<>(map);
		System.out.println(map1);
	

	}

}
