package com.goldmansachs;

/*
 * birthday party question: In a circle children are sitting (ordered. By ascending id)
 *  there is a random number D(1 to N) starting with D, distribute the toy to each sequential kid,
 *   until all toys distributed.but the last toy is damaged, the task is to find the number at which 
 *   kid is sitting who get the damage toy
 *   
 */
public class FindTheKidWithTheDamagedToy {

	public static void main(String[] args) {
		/*
		 * int numberOfKids = 10; int D = 5; int numberOfToys = 20;
		 */
		/*
		 * int numberOfKids = 30; int D = 5; int numberOfToys = 20;
		 */
		/*
		 * int numberOfKids = 5; int D = 3; int numberOfToys = 2;
		 */		
		/*
		 * int numberOfKids = 7; int D = 3; int numberOfToys = 2;
		 */
		int numberOfKids = 7;
		int D = 3; 
		int numberOfToys = 7;
		//((toys%kids - 1 + 5))%kids
		//
		System.out.println((numberOfToys%numberOfKids - 1 + D)%numberOfKids);

	}

}
