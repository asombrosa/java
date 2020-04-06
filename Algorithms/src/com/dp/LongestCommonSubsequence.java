package com.dp;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String A = "AGGTAB";
		String B = "GXTXAYB";
		char a[] = A.toCharArray();
		char b[] = B.toCharArray();
		int m = A.length();
		int n = B.length();
		System.out.println(longestCommonSubsequence(a, b, m, n));
	}

	private static int longestCommonSubsequence(char[] a, char[] b, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (a[m - 1] == b[n - 1])
			return 1 + longestCommonSubsequence(a, b, m - 1, n - 1);
		else
			return max(longestCommonSubsequence(a, b, m - 1, n), longestCommonSubsequence(a, b, m, n - 1));
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
