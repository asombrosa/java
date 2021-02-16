package com.interview.questions.sde2.kLargestElementInArray;

import java.util.Arrays;

/*
For example, if given array is [1, 23, 12, 9, 30, 2, 50]
and you are asked for the largest 3 elements i.e., k = 3
then your program should print 50, 30 and 23.

Time complexity : n * k
 */
public class Approach3UsingBubbleSort {
    public static void main(String[] args) {
        //int[] array = {5, 9, 1, 7, 2, 0, 4, 3};
        int[] array = {5, 1, 7, 2, 0, 4, 3, 9};
        int k = 4;
        printKLargestNumbers(array, k);
    }

    private static void printKLargestNumbers(int[] array, int k) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < k; i++) {
            swapped = false;
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        Arrays.stream(array).limit(k).forEach(System.out::println);
    }
}
