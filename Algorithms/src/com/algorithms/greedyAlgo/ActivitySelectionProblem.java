package com.algorithms.greedyAlgo;

/*
 * You are given n activities with their start and finish times. 
 * Select the maximum number of activities that can be performed by a single person, 
 * assuming that a person can only work on a single activity at a time.

	Example : Consider the following 6 activities 
	sorted by by finish time.
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
	A person can perform at most four activities. The 
	maximum set of activities that can be executed 
	is {0, 1, 3, 4} [ These are indexes in start[] and 
	finish[] ]
	
	1) Sort the activities according to their finishing time
	2) Select the first activity from the sorted array and print it.
	3) Do following for remaining activities in the sorted array.
		.a) If the start time of this activity is greater than or equal to the 
		finish time of previously selected activity then select this activity and print it.
	
*/
public class ActivitySelectionProblem {
	public static void main(String[] args) {
		int s[] = { 1, 0, 5, 3, 8, 5 };
		int f[] = { 2, 6, 7, 4, 9, 9 };
		int n = s.length;

		printMaxActivities(s, f, n);

	}

	private static void printMaxActivities(int[] s, int[] f, int n) {

		// sort both arrays according to finish[]
		sort(s, f, n);
		//JUST TO CHECK IF CORRECTLY SORTED
		print(s,f,n);
		// print the first activity
		int i =0;
		System.out.print(i + " ");
		// If the start time is greater than or equal to the finish time of previously
		// selected
		// activity then select the activity and print it
		for(int j =1; j<n;j++) {
			if(s[j]>=f[i]) {
				System.out.print(j + " ");
				i = j;
			}
		}
	}

	private static void print(int[] s, int[] f, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(s[i] + " " + f[i]);
			System.out.println();
		}
		
	}

	private static void sort(int[] s, int[] f, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (f[i] > f[j]) {
					f = swap(f, i, j);
					s = swap(s, i, j);
				}
			}
		}
	}

	private static int[] swap(int[] f, int i, int j) {
		int t = f[i];
		f[i] = f[j];
		f[j] = t;
		return f;
	}

}
