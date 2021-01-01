package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericParameters {
	
	public static <T extends Comparable<T>>
	void check(List<T> list1, List<T>list2) {
		//Here <T extends Comparable<T>> means 
		//that the type of list we have extends 
		//or inherits the Comparable interface
		System.out.println("Everything is working");
	}

	public static <T extends Number>
	void testInvalid(List<T> list1, List<T>list2) {
		//Here <T extends Comparable<T>> means
		//that the type of list we have extends
		//or inherits the Comparable interface
		System.out.println("Everything is working");
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		check(list1,list2);
		//If here we try to pass two lists of type
		//GenericParameters, we will get a compilation error
		//because the type GenericParameters doesn't
		//inherit properties of Comparable.

		//testInvalid
		//List<String> stringList1 = new ArrayList<>();
		//List<String> stringList2 = new ArrayList<>();
		//testInvalid(stringList1,stringList2);


	}
}
