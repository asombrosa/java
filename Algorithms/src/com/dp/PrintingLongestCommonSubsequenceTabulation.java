package com.dp;

public class PrintingLongestCommonSubsequenceTabulation {

	public static void main(String[] args) {
		String A = "AGGTAB";
		String B = "GXTXAYB";
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();

		int m = a.length;
		int n = b.length;

		lcs(a, b, m, n);
	}

	private static void lcs(char[] a, char[] b, int m, int n) {
		int arr[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					arr[i][j] = 0;
				} else if (a[i - 1] == b[j - 1]) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
				} else {
					arr[i][j] = max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}

		int index = arr[m][n];
		int temp = index;

		char[] lcs = new char[index + 1];
		lcs[index] = ' ';

		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (a[i - 1] == b[j - 1]) {
				lcs[index - 1] = a[i - 1];
				i--;
				j--;
				index--;
			} else if (arr[i - 1][j] > arr[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}

		for (int k = 0; k <= temp; k++) {
			System.out.print(lcs[k]);
		}
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}
}
