package com.recursion;

/*
 * array = [1,4,5,2,9,5,2,7,3]
 * max=0
 * 
 * val = 1
 * val > max 
 * => max = 1 
 * 
 */
public class MaximumNumberInArray {

	public int maximum(int arr[], int index, int max) {
		if(arr.length == 0)
			return 0;
		if(arr.length == 1)
			return arr[0];
		if(index < arr.length) {
			if(arr[index] > max)
				max = arr[index];
			return maximum(arr,index+1,max);
		}
		return max;
	}
	public static void main(String[] args) {
		MaximumNumberInArray maximumNumberInArray = new MaximumNumberInArray();
		int array[] = { -1, -4, -5, -2, -9, -5, -2, -7, -3 };
		System.out.println(maximumNumberInArray.maximum(array, 0, Integer.MIN_VALUE));
	}
}
