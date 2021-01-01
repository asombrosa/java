package com.searching;

public class SearchingInUnorderedArray {

	public static void main(String[] args) {
		int arr[] = { 7, 2, 5, 1, 8, 10 };
		SearchingInUnorderedArray searchingInUnorderedArray = new SearchingInUnorderedArray();
		searchingInUnorderedArray.findElement(arr, 8);
		searchingInUnorderedArray.findElement(arr, 20);

	}

	private void isFound(int value, int searchValue) {
		if (value == -1) {
			System.out.println("Search Value " + searchValue + " not found");
		}
	}

	private void findElement(int arr[], int searchValue) {
		int found = -1;
		for (int counter = 0; counter < arr.length; counter++) {
			if (arr[counter] == searchValue) {
				System.out.println("Value found: " + searchValue);
				found = searchValue;
				break;
			}
		}
		isFound(found, searchValue);
	}
}
