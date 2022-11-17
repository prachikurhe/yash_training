package com.assignments.string;
/*3   WAP to remove all the vowels from the given string.
 * 
 */
public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "hElloWord";

		String lower_case = name.toLowerCase();

		char[] arr = lower_case.toCharArray();

		char result;
		char notVowel;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				result = arr[i];
			} else {
				notVowel = arr[i];
				System.out.print(" "+notVowel);
			}
		}

	}

}
