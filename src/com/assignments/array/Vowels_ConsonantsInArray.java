package com.assignments.array;

/*7     You are given a sequence of Character in the form of Array. Now you have to put all vowels and consonants together in the array.
 * 
 */
public class Vowels_ConsonantsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };

		System.out.println("Vowels and Consonants together:");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				System.out.println(arr[i]);

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
				System.out.println(arr[i]);

			}
		}
	}

}
