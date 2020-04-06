package com.recursion.dynamic.spaceOptimize;

/*
 * tabulation for :
 * 
 * Fibonacci Series using Recursion 
	class fibonacci { 
		static int fib(int n) { 
			if (n <= 1) 
				return n; 
			return fib(n-1) + fib(n-2); 
		} 
	
		public static void main (String args[]) { 
			int n = 9; 
			System.out.println(fib(n)); 
		} 
	} 
 */
public class FibonaciSeriesTabulation {

	public static void main(String[] args) {
		int N = 10;
		int arr[] = new int[N + 2];
		System.out.println(fibonacci(N - 1, arr));
	}

	private static int fibonacci(int i, int[] arr) {
		arr[0] = 0;
		arr[1] = 1;
		for (int index = 2; index <= i; index++) {
			arr[index] = arr[index - 1] + arr[index - 2];
		}
		return arr[i];
	}

	/*
	 * private static int fibonacci(int n, int[] arr) { if(n == 0) return 0; if(n ==
	 * 1) return 1; if(arr[n-1] != -1 && arr[n-2] != -1) return arr[n] = arr[n-1] +
	 * arr[n-2]; else return arr[n] = fibonacci(n -1, arr) + fibonacci(n - 2, arr);
	 * }
	 */
}
