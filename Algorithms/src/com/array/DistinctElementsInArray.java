package com.array;

public class DistinctElementsInArray {
	
	public static void main(String[] args) {
		int arr[] = {1,2,12,12,5,3,2,13,54,6,54,6,2,4,3};
		String s ="";
		for(int a: arr) {
			if(s.contains(String.valueOf(a))) {
				
			}else {
				System.out.println(a);
				s= s+ a+ "-";
			}
		}
	}

}
