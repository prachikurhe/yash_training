package com.assignments.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*3) WAP to store elements in List and remove all duplicates value from it. (Numbers 
should be inserted). When duplicates are removed print all elements in ascending 
order.
*/
public class RemoveDuplicateOrderAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(16);
		list.add(11);
		list.add(13);
		list.add(11);
		list.add(13);
		System.out.println(list);
		Set<Integer> set1 = new TreeSet<>(list);

		System.out.println(set1);

//	

	}

}
