package com.assignments.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*4) WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order.
*/
public class RemoveDuplicateOrderDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Prachi");
		list.add("Nikita");
		list.add("Nikita");
		list.add("Prachi");
		list.add("Aniket");
		list.add("Varsha");
		list.add("Payal");
		list.add("Tushar");

		System.out.println(list);
		Set<String> set1 = new TreeSet<>(list);
		System.out.println("After removing duplicate:" + set1);
		List<String> l1 = new ArrayList<>(set1);
		Collections.reverse(l1);
		System.out.println("Elements in desc order:" + l1);

	}

}
