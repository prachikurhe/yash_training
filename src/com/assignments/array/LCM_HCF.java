package com.assignments.array;

/*6     WAP to find the LCM and HCF of array numbers.
 * 
 */
public class LCM_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 8, 24, 4 };
		int result = arr[0];

		int max, min, x, lcm = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					max = arr[i];
					min = arr[j];

				} else {
					min = arr[i];
					max = arr[j];
				}

				for (int k = 0; k < arr.length; k++) {
					x = k * max;
					if (x % min == 0) {
						lcm = x;
					}

				}
			}

		}
		System.out.println("LCM of the given array of numbers : " + lcm);
		
		
		 for(int i=1; i<arr.length; i++){
		      result = findHCF(arr[i], result);
		    }
		    System.out.print("HCF: "+result);
		  }
		 
		  public static int findHCF(int a, int b){
		    if(b == 0)
		      return a;
		    return findHCF(b, a%b);
		  }

	}

