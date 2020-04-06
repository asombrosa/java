package com.dp;

public class LongestCommonSubsequenceTabulation {
	
	public static void main(String[] args) {
		String A = "AGGTAB";
		String B = "GXTXAYB";
		
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		
		int m = a.length;
		int n = b.length;
		
		 System.out.println(lcs(a,b,m,n));
	}

	private static int lcs(char[] a, char[] b, int m, int n) {
		
		int arr[][] = new int[m + 1][n + 1];
		
		for(int  i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				if(i == 0 || j == 0)
					arr[i][j] = 0;
				else if(a[i - 1] == b[j - 1])
					arr[i][j] = 1 + arr[i - 1][j - 1];
				else
					arr[i][j] = max(arr[i - 1][j], arr[i][j - 1]);
			}
		}
		return arr[m][n];
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

}
