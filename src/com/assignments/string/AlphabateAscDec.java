package com.assignments.string;

/*2   WAP to print the all alphabets of string in ascending and descending order.
 */
public class AlphabateAscDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bcda";
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}
		System.out.println("String in ascending order:");
		System.out.println(new String(ch));

		System.out.println();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}
		System.out.println("String in descending order:");
		System.out.println(new String(ch));

	}

}
