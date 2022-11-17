package com.assignments.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*1) WAP to sort Collection elements in ascending order.
*/
public class SortInAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(12);
		list.add(16);
		list.add(11);
		list.add(13);
		System.out.println("Elements before sorting:" + list);
		System.out.println("Elements after sorting:");
		Collections.sort(list);
		System.out.println(list);

	}

}
