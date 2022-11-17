package com.assignments.array;
/*10 WAP to sort array on the basis of unit place. For example we are having following 
 * numbers:- 10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9.
 * 
 */
public class SortArrayUnitPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,2,3,41,12,13,19,81,9};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]%10>arr[j]%10) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
			}
			System.out.print(" "+arr[i]);

		}

	}

}
