package com.recursion.dynamic.spaceOptimize;

public class FibonacciSeriesSpaceOptimization {

	public static void main(String[] args) {
		int N = 10;
		int term1 = 0;
		int term2 = 1;
		System.out.print(term1 + " " + term2 + " ");
		int term3 = -1;
		for(int i = 0; i < N - 2; i++) {
			term3 = term1 + term2;
			System.out.print(term3 + " ");
			term1 = term2;
			term2 = term3;
		}
	}
}