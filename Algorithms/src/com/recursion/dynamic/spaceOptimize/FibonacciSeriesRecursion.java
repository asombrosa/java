package com.recursion.dynamic.spaceOptimize;

public class FibonacciSeriesRecursion {

	public static void main(String[] args) {
		int N = 10;
		System.out.println(fibonacci(0, 1, N - 2));
	}

	private static int fibonacci(int i, int j, int n) {
		if (n == 0)
			return j;
		else {
			int k = i;
			i = j;
			j = k + j;
		}
		return fibonacci(i, j, n - 1);
	}
}
