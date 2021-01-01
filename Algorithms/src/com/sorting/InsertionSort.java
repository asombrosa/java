package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		 int unsortedArray[] = { 10, 2, 8, 6, 7, 3 };
		// int unsortedArray[] = { 10, 9, 8, 7, 6, 3 };
		// int unsortedArray[] = { 10, 2, 3, 4, 5, 6 };
		//int unsortedArray[] = { 10, 8, 3, 6, 5, 7, 4 };

		sort(unsortedArray, unsortedArray.length);
	}

	static int iterationCounter = 1;

	public static void print(int array[]) {
		System.out.println("Elements After First Iteration : " + iterationCounter);
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
		iterationCounter++;
	}

	public static void sort(int array[], int length) {
		for (int pointer = 1; pointer < length; pointer++) {
			int currentValue = array[pointer];
			int currentPointer = pointer;
			for (int sortedArrayIndex = pointer - 1; sortedArrayIndex >= 0; sortedArrayIndex--) {
				if (currentValue < array[sortedArrayIndex]) {
					array[currentPointer] = array[sortedArrayIndex];
					currentPointer = sortedArrayIndex;
				} else {
					break;
				}
			}
			if (currentPointer != -1) {
				array[currentPointer] = currentValue;
			}
			print(array);
		}
	}
}
