package com.assignments.array;

import java.util.ArrayList;
import java.util.Iterator;

/*WAP to remove the String which is not palindrome string from the array of String.
 * 
 */

public class RemoveStringNotPalindrome {

	static boolean isPalindrome(String str) {

		int leftmost = 0;
		int rightmost = str.length() - 1;

		while (rightmost > leftmost) {
			if (str.charAt(leftmost++) != str.charAt(rightmost--)) {
				return false;
			}
		}
		return true;
	}

	static ArrayList<String> PalindromicStrings(String[] arr, int N) {
		ArrayList<String> ans = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			if (isPalindrome(arr[i])) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "madam", "lol", "java", "hello", "nitin" };
		  int N = arr.length;
          
          ArrayList<String> s = PalindromicStrings(arr, N);
          if(s.size() == 0)
            System.out.print("-1");
          for (String st : s)
            System.out.print(st + " ");
        }

	

}
