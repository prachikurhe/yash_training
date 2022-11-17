package com.assignments.java8Feature.lambda;

import java.util.Scanner;

interface CheckNo {
	void print();
}

public class CheckNo_AOEP {
	/*
	 * 3. User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4
	 * 454. 1 to check given no is even, 2 for odd number, 3 for Armstrong number, 4
	 * for palindrome number.
	 */
	public static void main(String[] args) {
		CheckNo c = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int value = scan.nextInt();
		scan.nextLine();
		switch (value) {

		case 1:
			c = () -> {
				System.out.println("Enter second number");
				if (scan.nextInt() % 2 == 0) {
					System.out.println("number is even");
				} else {
					System.out.println("number is not even");
				}
			};
			c.print();
			break;
		case 2:
			System.out.println("Enter second number");
			c = () -> {
				int i = scan.nextInt();
				if (i % 2 != 0) {
					System.out.println("number is an odd");
				} else {
					System.out.println("number is not an odd");
				}
			};
			c.print();
			break;
		case 3:
			c = () -> {
				System.out.println("Enter second number");
				int i = scan.nextInt();
				int temp = i, num = i, count = 0, mul, sum = 0;

				while (temp != 0) {
					temp = temp / 10;
					count++;
				}
				while (i != 0) {
					int digit = i % 10;
					mul = 1;
					for (int j = 1; j <= count; j++) {
						mul = mul * digit;
					}
					sum = sum + mul;
					i = i / 10;
				}
				if (num == sum) {
					System.out.println("number is an armstrong");
				} else {
					System.out.println("number is not an armstrong");
				}

			};
			c.print();
			break;
		case 4:
			System.out.println("Enter second number");
			c = () -> {
				int i = scan.nextInt(), num, digit, rem = 0;
				num = i;
				while (i != 0) {
					digit = i % 10;
					rem = rem * 10 + digit;
					i = i / 10;
				}
				if (num == rem) {
					System.out.println("Number is Palindrom");
				} else {
					System.out.println("Number is not Palindrom");
				}
			};
			c.print();
			break;
		default:
			System.out.println("Enter valid number");
			break;
		}
	}
}
