package com.goldmansachs;

/*
 *  Pangram question: 
 *  You have given a string =”This is ram”, 
 *  you need to find all those letters that are missing 
 *  in the string out of all 26 a-z letters present in alphabets
 *  
 */
public class Panagram {

	public static void main(String[] args) {
		String input = "This is Ram";
		for(char ch = 'a'; ch <= 'z'; ch ++) {
			if(!input.contains((ch) +"")) {
				System.out.print(ch + " ");
			}
		}
	}

}
