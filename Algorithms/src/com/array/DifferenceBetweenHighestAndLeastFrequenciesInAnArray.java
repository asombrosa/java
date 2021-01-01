package com.array;

import java.util.HashMap;

public class DifferenceBetweenHighestAndLeastFrequenciesInAnArray {

	public static void main(String[] args) {
		int inputArray[] = {1,2,12,12,5,3,2,13,54,6,54,6,2,4,3};
		System.out.println(getDifference(inputArray));
	}

	private static int getDifference(int[] inputArray) {
		int maxFrequency = 0;
		int minFrequency = 999;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int number: inputArray) {
			int count = 0;
			if(map.containsKey(number)) {
				count = map.get(number);	
			}
			map.put(number, count+1);
			if(count+1 < minFrequency) {
				minFrequency = count +1;
			}
			if(count +1 > maxFrequency) {
				maxFrequency = count + 1;
			}
		}
		return maxFrequency - minFrequency;
	}
}
