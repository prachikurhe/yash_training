package com.assignmets.exception.Exception_Q10;

import java.util.Arrays;

public class Child extends Parent {
	void largest(int[] arr) {
		try {
			System.out.println("I am from Child class");
			Arrays.sort(arr);

		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(e);
		}

	}
}
