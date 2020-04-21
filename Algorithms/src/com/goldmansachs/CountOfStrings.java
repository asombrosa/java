package com.goldmansachs;

/*
 * Input : GeeeEEKKKss
 * Output : G1e3E2K3s2
 *
 * Input : ccccOddEEE
 * Output : c4O1d2E3
 *
 */
public class CountOfStrings {

	public static void main(String[] args) {
		String input = "GeeeEEKKKskks";
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i - 1) == input.charAt(i)) {
				count++;
			} else {
				System.out.print(input.charAt(i - 1) + "" + count);
				count = 1;
			}
		}
		System.out.println(input.charAt(input.length() - 1) + "" + count);
	}

}
