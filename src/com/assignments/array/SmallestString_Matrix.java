package com.assignments.array;

import java.util.Scanner;

/*8 User will enter the element in M*M order matrix that is square matrix now you have to print 
 *  first row, last row, first column, and last column elements. Code should be applicable for matrix of any order.
// You are having array of strings. Now you have to arrange strings in array on the basis of the length of each string.
  Smallest string will be first and so on. 
       */
public class SmallestString_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "ab", "abcd", "abc", "a" };
		int n = arr.length;
        System.out.println("String starts from smallest length :");
		String temp; 
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].length() > arr[j].length()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.print(" " + arr[i]);

		}
		System.out.println();
		 int m, i, j;
	        Scanner in = null;



	       in = new Scanner(System.in);
	        System.out.println("Enter the order of the square matrix");
	        m = in.nextInt();



	       int array[][] = new int[m][m];



	       System.out.println("Enter the elements of the matrix");
	        for (i = 0; i < m; i++)
	            for (j = 0; j < m; j++)
	                array[i][j] = in.nextInt();



	       System.out.println("Elements of the matrix are");
	        for (i = 0; i < m; i++) {
	            for (j = 0; j < m; j++) {
	                System.out.print(array[i][j] + "  ");
	            }
	            System.out.println();
	        }



	       System.out.print("first row---> ");
	        for (i = 0; i < m; i++)
	            System.out.print(array[0][i] + "  ");



	       System.out.print("Last row---> ");
	        for (i = 0; i < m; i++)
	            System.out.print(array[m - 1][i] + "  ");



	       System.out.println("first column--->");
	        for (i = 0; i < m; i++)
	            System.out.print(array[i][0] + "\n");



	       System.out.println("last column--->");
	        for (i = 0; i < m; i++)
	            System.out.print(array[i][m - 1] + "\n");
	    }
	}


