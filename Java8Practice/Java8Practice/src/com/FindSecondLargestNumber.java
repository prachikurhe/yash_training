package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
		 
		 
        // print to console
        System.out.println("Original Integer List : " + numbers);
 
 
 
        // sort in descending-order and get 2nd largest element
        int secondLargestNumber = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        
        System.out.println("secondLargestNumber="+secondLargestNumber);
 
	}

}
