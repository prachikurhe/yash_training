package com.assignments.java8Feature.lambda;

import java.util.Arrays;

public class FindAST {
	/*
	 * 2. WAP to check the given sequence of character in given string. Suppose that
	 * you are given following string �Taj is situated in Agra.� And you have to
	 * find following sequence AST. AST should be one after another. If you found
	 * sta, or tas, or tsa it should print string not found.
	 */
	public static void main(String[] args) {
		String s = "Taj is Situated in Agra";
		String a = "ast";
		String[] strings = s.split(" ");
		boolean match = Arrays.stream(strings).anyMatch(n -> n.contains(a));
		if (match == true) {
			System.out.println("string is found");
		} else {
			System.out.println("string is not found");
		}

	}
}
