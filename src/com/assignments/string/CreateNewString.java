package com.assignments.string;
/*1  Create a program in which two string is input by the user and after that user 

will enter index in first string where we want to insert the second string and insert 
the second string at that index and create a new string 
*/

import java.util.Scanner;
class A{
	public String concatString(String first, String second, int index) {
		String newString = "";
		for (int i = 0; i < first.length(); i++) {
			if (i != index) {
				newString = newString + first.charAt(i);
			} else {
				newString = newString + second;
				newString = newString + first.charAt(i);
			}
		}
		return newString;
	}
	
}
public class CreateNewString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String:");
		String first = scanner.nextLine();
		System.out.println("Enter Second String:");
		String second = scanner.nextLine();
		System.out.println("Enter Index:");
		int index = scanner.nextInt();
		if (index > first.length()) {
			System.out.println("Enter valied Index...");
		} else {
			A a = new A();
			String ans = a.concatString(first, second, index);
			System.out.println(ans);
		}


	}

}
