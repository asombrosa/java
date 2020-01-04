package com.recursion;

/*
 * array = [1,4,5,2,9,5,2,7,3]
 * sum = 38
 * val = 1
 * sum = sum + val
 * sum =  0   +  1
 * sum =  	1
 * 
 * val = 4
 * sum = sum + val
 * sum =  1  +  4
 * sum = 	5
 * 
 *  	.
 *  	.
 *  	.
 *  
 *  	so on 
 *  
 */
public class SumOfArray {

	public int sum(int arr[], int index) {
		if (arr.length == 0)
			return 0;
		if (arr.length == 1)
			return arr[0];
		if(index < arr.length)
			return arr[index] + sum(arr, index + 1);
		return 0;
	}

	public static void main(String[] args) {
		int array[] = { 1, 4, 5, 2, 9, 5, 2, 7, 3 };
		SumOfArray sumOfArray = new SumOfArray();
		System.out.println(sumOfArray.sum(array, 0));
	}
}
