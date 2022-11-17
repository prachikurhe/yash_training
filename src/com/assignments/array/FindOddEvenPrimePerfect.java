package com.assignments.array;
/*An Array Contain different numbers you have to find how many are even, odd, perfect and prime 
 * 
 */

public class FindOddEvenPrimePerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;

		int count_odd = 0, count_even = 0;
		int count_prime = 0;
		int count_perfect = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 1) {
				count_odd++;
			} else {
				count_even++;
			}

		}
		for (int i = 0; i < n; i++) {
			int p = i;
			int a = 2;
			int temp = 0;
			while (a <= (p / 2)) {
				if ((p % a) == 0) {
					temp++;
					break;
				}
				a++;
				if (temp == 0 && i != 1) {
					count_prime++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int m = i;
			int f = 1;
			int sum = 0;
			while (f <= (m / 2)) {
				if ((m % f) == 0) {
					sum = sum + f;
				}
				f++;
			}
			if (sum == i) {
				count_perfect++;
			}
		}

		System.out.println("Odd:" + count_odd);
		System.out.println("even:" + count_even);
		System.out.println("prime:" + count_prime);
		System.out.println("perfect:"+count_perfect);

	}

}
