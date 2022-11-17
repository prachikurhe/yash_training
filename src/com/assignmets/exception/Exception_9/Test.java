package com.assignmets.exception.Exception_9;

import java.util.Scanner;

/*A collar maker makes the collar for different size of shirts. The collar he made is having standard 
deviation of 2% from actual size means that if he made collar of size 30, it may be increased to 30.6 
which is acceptable. Your task is to take the input for collar size and check how many collar are 
satisfy the standard deviation rate which is 2% and how many are not. If more than 5 collar out of 
10 is not satisfying the condition then you have to thrown CollarStandardDeviateException. You 
have to take size of each collar and calculate how much size is deviated from actual size. */

public class Test {
	static int collarCount = 0;

	public static void getCollarDetails() {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter collar size");

			double collarSize = scanner.nextDouble();

			if (collarSize >= 29.4 && collarSize <= 30.6) {
				collarCount++;

			}

		}
		try {
			if (collarCount > 5) {
				System.out.println("Total collars with accepted standard deviation =" + collarCount);
			} else {
				throw new CollarStandardDeviateException("The collars Standard Deviation is not satisfying");

			}

		} catch (CollarStandardDeviateException e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		getCollarDetails();

	}
}
