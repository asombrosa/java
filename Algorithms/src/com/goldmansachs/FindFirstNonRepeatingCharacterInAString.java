package com.goldmansachs;

/*
 * Given a string, find the first non-repeating character in it. 
 * For example, if the input string is “GeeksforGeeks”, then the output 
 * should be ‘f’ and if the input string is “GeeksQuiz”, then the output should be ‘G’.
 * 
 */
public class FindFirstNonRepeatingCharacterInAString {

	public static void main(String[] args) {
		String input = "GeeksforGeeks";
		//String input = "GeeksQuiz";
		boolean value = false;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ')
				continue;
			if ((input.substring(i + 1)).contains(input.charAt(i) + "")) {
				input = input.replace(input.charAt(i), ' ');
				continue;
			} else {
				System.out.println(input.charAt(i));
				value = true;
				break;
			}
		}
		if (!value) {
			System.out.println("No non-repeating character!!");
		}
	}
}
