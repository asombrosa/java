package com.array;

import java.util.Stack;

//Java program to find number of subarrays 
//with sum exactly equal to k. 

public class SubArraysWhoseSumIsEqualToN {
	int result = 0;

	public static void main(String[] args) {
		//int inputArray[] = { 1, 2, 12, 12, 5, 3, 2, 13, 54, 6, 54, 6, 2, 4, 3 };
		 int inputArray[] = { 10, 2, -2, -20, 10 };
		int sum = -10;
		SubArraysWhoseSumIsEqualToN subArraysWhoseSumIsEqualToN = new SubArraysWhoseSumIsEqualToN();
		subArraysWhoseSumIsEqualToN.findNoOfSubArrays(inputArray, sum);

	}

	private void findNoOfSubArrays(int[] inputArray, int sum) {
		Stack<Integer> subset = new Stack<Integer>();
		int calsum = 0;
		subArraysUtil(inputArray, subset, 0, sum, calsum);
		System.out.println("result: " + result);

	}

	private void subArraysUtil(int[] inputArray, Stack<Integer> subset, int i, int sum, int calsum) {
		if (!subset.isEmpty()) {
			 //System.out.println(calsum);
			if (calsum == sum) {
				System.out.println(subset);
				result++;
			}
		}
		for (int index = i; index < inputArray.length; index++) {
			subset.add(inputArray[index]);
			calsum += inputArray[index];
			subArraysUtil(inputArray, subset, index + 1, sum, calsum);
			calsum -= subset.peek();
			subset.pop();
		}
	}
}
