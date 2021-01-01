package com.generics;
import java.util.ArrayList;
/*
 *	Prior to JAVA 5, when we wanted to retrieve elements of a collection, 
 *	In order to retrieve it we had to cast it to the type of element stored 
 *	in the collection. It was unsafe because it occurs only at runtime.
 *	So we were not able to handle exceptions at compile-time.
 *	Following is an example to demonstrate the same.
 *  
 */
public class BeforeGenerics {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3.0);
		int total = 0;
		for(Object number: numbers) {
			total += (Integer)number;
			//The list only knew what it 
			//stored was Object, it was 
			//up to the code using the list
			//to cast back to a useful type.
		}
		System.out.println(total);
	}
}
