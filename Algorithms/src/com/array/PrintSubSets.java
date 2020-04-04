package com.array;

import java.util.Stack;

public class PrintSubArrays {

	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4 };
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 4
		// 1 4
		// 1 3 4
		// 1 3
		// 2
		// 2 3
		// 2 3 4
		// 2 4
		// 3
		// 3 4
		// 4
		PrintSubArrays printSubArrays = new PrintSubArrays();
		printSubArrays.subsets(inputArray);
	}

	private void subsets(int[] inputArray) {
		Stack<Integer> subsets = new Stack<Integer>();
		subsetUtil(inputArray, subsets, 0);
	}

	private void subsetUtil(int[] inputArray, Stack<Integer> subsets, int i) {
		if (!subsets.isEmpty()) {
			System.out.println(subsets);
		}
		for (int index = i; index < inputArray.length; index++) {
			subsets.push(inputArray[index]);
			subsetUtil(inputArray, subsets, index + 1);
			subsets.pop();
		}
	}
}
