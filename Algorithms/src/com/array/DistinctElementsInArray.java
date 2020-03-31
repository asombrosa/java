package com.array;

public class DistinctElementsInArray {
	
	public static void main(String[] args) {
		int inputArray[] = {1,2,12,12,5,3,2,13,54,6,54,6,2,4,3};
		String stringForStoringDistinctElements ="";
		for(int number: inputArray) {
			if(stringForStoringDistinctElements.contains(String.valueOf(number))) {
				
			}else {
				System.out.println(number);
				stringForStoringDistinctElements= stringForStoringDistinctElements+ number+ "-";
			}
		}
	}

}
