package com.recursion;

/*
 * 0 		1 		1 2 3 5 8 13 
 * f(0) 	f(1)	f(2)
 * Iteration 1:
 * first = 0		f(0)
 * second = 1		f(1)
 * sum = 1			f(2)
 * 
 * Iteration 2:
 *  first = 1 	  	f(1)	
 *  second = 1    	f(2)
 *  sum = 2			f(3)
 *  
 *  Iteration 3:
 *  first = 1		f(2)
 *  second = 2    	f(3)
 *  sum = 3 		f(4)
 *  
 */
public class FibonacciSeries {

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		System.out.println(fibonacciSeries.fibonacci(3));
	}
}
