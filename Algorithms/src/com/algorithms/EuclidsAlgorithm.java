package com.algorithms;
/*
 * Euclid's Algorithm
 * Step1:
 * 	if a>b, then r=a%b;
 * 	if r=0, stop, gcd =b;
 * 	otherwise set a=b; b=r;
 */
public class EuclidsAlgorithm {

	public static void main(String[] args) {
		System.out.println(gcd(20, 8));  //should be 4
		System.out.println(gcd(60, 96)); //should be 12
	}

	private static int gcd(int i, int j) {
		while (j != 0) {
			int t = i;
			i = j;
			j = t % i;
		}
		return i;
	}
}
