package com.assignments.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*WAP to print the number of alphabets repeated in the given string.
	*/
public class RepeatedAlphabateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abddcdc";
		
		char[]ch=s.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		for(char chr:ch) {
			if(!map.containsKey(chr)) {
				map.put(chr, 1);
			}
			else
			{   int count=map.get(chr);
				map.put(chr, count+1);
			}
		}
		for(Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		

	}

}
