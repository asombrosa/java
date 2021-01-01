package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		//int unsortedArray[] = { 10, 2, 8, 6, 7, 3 };
		//int unsortedArray[] = { 10, 9, 8, 7, 6, 3 };
		int unsortedArray[] = { 10, 2, 3, 4, 5, 6 };

		sort(unsortedArray);
	}

	static int iterationCounter = 1;

	public static void swap(int indexOfValue1, int indexOfValue2, int array[]) {
		int temp = array[indexOfValue2];
		array[indexOfValue2] = array[indexOfValue1];
		array[indexOfValue1] = temp;
	}

	public static void print(int array[]) {
		System.out.println("Elements After First Iteration : " + iterationCounter);
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
		iterationCounter++;
	}

	public static void sort(int array[]) {
		int length = array.length;
		//for optimized version compare length till 1
		//if 4 elements are sorted in an array of 5,
		//obviously the last element is also sorted
		while (length != 0) {
			for (int indexOfFirstElement = 0; indexOfFirstElement < length - 1; indexOfFirstElement++) {
				int indexOfSecondElement = indexOfFirstElement + 1;
				if (array[indexOfFirstElement] > array[indexOfSecondElement]) {
					swap(indexOfFirstElement, indexOfSecondElement, array);
				}
			}
			print(array);
			length--;
		}
	}

}
