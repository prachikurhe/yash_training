package com.assignments.java8Feature.lambda;

interface Check {
	void print();
}

public class PalindromeOrNot {
	public static void main(String[] args) {
		Check c = () -> {
			String s = "madam";
			char ch;
			String str = "";
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);
				str = ch + str;
			}
			if (s.equals(str)) {
				System.out.println("String is palindrome");
			} else {
				System.out.println("String is not palindrome");
			}
		};
		c.print();
	}
}
//String number="12321";
//char ch[]=number.toCharArray();
//char temp[]=new char[number.length()];
//
//Check c=()->{
//    int j=0;
//    for(int i=ch.length-1;i>=0;i--) {
//        temp[j++]=ch[i];
//    }
//    if( Arrays.equals(ch, temp)) {
//        System.out.println("number is palindrom");
//    }
//    else {
//        System.out.println("number is not palindrom");
//    }
//};
//c.print();