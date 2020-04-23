package com.goldmansachs;

public class CountWaysToReachNthStair {

	public static void main(String[] args) {
		int n = 4;
		int l = fib(n+1);
		System.out.println(l);
	}

	private static int fib(int i) {
		if(i <=1)
			return i;
		
		return fib(i - 1) + fib(i -2);
	}

}
