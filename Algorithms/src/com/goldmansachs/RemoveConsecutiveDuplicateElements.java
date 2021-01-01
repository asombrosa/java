package com.goldmansachs;
/*
 *  input: {1,1,2,2,2,3,3,4,2}
 *  output: {1,2,3,4,2}
 *  
 */
public class RemoveConsecutiveDuplicateElements {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,3,4,2,2,3};
		for(int i = 1; i < arr.length; i++) {
			if(arr[i - 1] != arr[i]) {
				System.out.print(arr[i -1] + ",");
			}
		}
		System.out.println(arr[arr.length - 1]);
	}
}
