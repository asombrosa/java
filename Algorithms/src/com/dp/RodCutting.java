package com.dp;

public class RodCutting {

	public static void main(String[] args) {
		int price[] = { 1, 5, 8, 9,10, 17, 17, 20 };
		int n = cutRod(price, price.length);
		System.out.println(n);
	}

	private static int cutRod(int[] price, int length) {
		if(length <= 0)
			return 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i< length;i++)
			max = Math.max(max, price[i] + cutRod(price, length - i - 1));
		return max;
	}
}
