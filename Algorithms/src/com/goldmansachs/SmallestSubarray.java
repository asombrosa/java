package com.goldmansachs;

/*
 *  Given a sum, find the length of smallest subarray 
 *  that has sum atleast to a given sum.
 *  
 */
public class SmallestSubarray {

	public static void main(String[] args) {
		/*
		 * int arr[] = {3,6,1,8,9,4,2,5}; int sum = 7;
		 */
		
		/*
		 * int arr[] = {1, 4, 45, 6, 10, 19}; int sum = 51;
		 */

		
		/*
		 * int arr[] = {1, 10, 5, 2, 7}; int sum = 9;
		 */		 
		/*
		 * int arr[] = { 1, 8, 2, 10, 5, 2, 7 }; int sum = 9;
		 */
		
		  int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}; int sum = 280;
		 
		int minlength = arr.length + 1;
		for (int i = 0; i < arr.length; i++) {
			int currsum = arr[i];
			if (currsum >= sum) {
				minlength = 1;
				break;
			}
			for (int j = i + 1; j < arr.length; j++) {
				currsum += arr[j];
				if (currsum >= sum && (j - i + 1) < minlength) {
					minlength = j - i + 1;
				}
			}
		}

		System.out.println(minlength);

	}

}
