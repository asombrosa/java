package com.searching;

public class SearchingInOrderedArray {

	public static void main(String[] args) {
		int orderedArray[] = { 3, 7, 20, 32, 45, 55, 60, 75 };
		binarySearch(orderedArray, 0, 7, 20);
		binarySearch(orderedArray, 0, 7, 200);
	}

	private static int binarySearch(int[] orderedArray, int start, int end, int searchElement) {
		int mid = (start + end) / 2;
		if (orderedArray[mid] == searchElement) {
			System.out.println(searchElement);
			return searchElement;
		} else if (start + 1 == end) {
			System.out.println("Not found");
			return -1;

		} else if (searchElement < orderedArray[mid]) {
			return binarySearch(orderedArray, start, mid, searchElement);
		} else {
			return binarySearch(orderedArray, mid, end, searchElement);
		}
	}
}
