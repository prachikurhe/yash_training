package com.assignments.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*2    WAP to find duplicate numbers and there counting from list of numbers.

 */
public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 4, 5 };
		Map<Integer, Integer> elementCount = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if (elementCount.containsKey(j)) {
				elementCount.put(j, elementCount.get(j) + 1);
			} else {
				elementCount.put(j, 1);
			}
		}

		elementCount.forEach((k, v) -> {
			if (v > 1)
				System.out.println("Number :: " + k + " Value :: " + v);
		});
		/*
		 * int temp; int count = 0; for (int i = 0; i < arr.length; i++) { for (int j =
		 * i + 1; j < arr.length; j++) { if (arr[i] == arr[j]) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * } } }
		 */

	}

}
