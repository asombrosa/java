package com.interview.questions.sde2.mergeKSortedArrays;

import java.util.TreeSet;

/*

Input:
k = 3, n = 4
arr[][] = { {1, 3, 5, 7},
{2, 4, 6, 8},
{0, 9, 10, 11}} ;
Output: 0 1 2 3 4 5 6 7 8 9 10 11
Explanation: The output array is a sorted array that contains all the elements of the input matrix.

 */
public class Approach1UsingTreeSet {
    public static void main(String[] args) {
        int[] arrayOne = {1, 12, 13};
        int[] arrayTwo = {4, 5, 16};
        int[] arrayThree = {0, 11, 15};
        int[] arrayFour = {2, 6, 8, 9};
        int[] arrayFive = {3, 7, 14};
        mergeArrays(arrayOne, arrayFive, arrayThree, arrayTwo, arrayFour);
    }

    private static void mergeArrays(int[]... arrays) {
        TreeSet<Integer> sortedElements = new TreeSet<>();
        for (int[] array : arrays) {
            for (int element : array) {
                sortedElements.add(element);
            }
        }
        sortedElements.forEach(System.out::println);
    }


}
