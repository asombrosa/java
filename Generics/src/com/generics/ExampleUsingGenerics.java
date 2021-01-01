package com.generics;

import java.util.ArrayList;

public class ExampleUsingGenerics {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		//The above line suggest that we are creating a 
		//typed list and the type is suggested in the angular brackets
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		//now here if we will try to add	
		//numbers.add(3.0);
		//it will throw a compilation error
		int total = 0;
		for(int number: numbers) {
			total += number;
		}
		System.out.println(total);
	}
}
