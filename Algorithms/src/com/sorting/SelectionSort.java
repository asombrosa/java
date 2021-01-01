package com.sorting;

public class SelectionSort {

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
		for (int pointer = 0; pointer < length - 1; pointer++) {
			int minimumElementIndex = pointer;
			int minimumElement = array[pointer];
			for (int j = pointer + 1; j < length; j++) {
				if (minimumElement > array[j]) {
					minimumElementIndex = j;
					minimumElement = array[j];
				}
			}
			swap(pointer, minimumElementIndex, array);
			print(array);
		}
	}

}
