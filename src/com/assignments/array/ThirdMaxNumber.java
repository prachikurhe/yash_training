package com.assignments.array;
//WAP to find third maximum number from list of numbers.

public class ThirdMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int temp;
		int size;
		size=a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" "+a[i]);

		}
		System.out.print("\n" +"Third maximum number is:"+a[size-3]);

	}

}
