package com.sorting.linearTimeAlgo;

import java.util.Arrays;

/*
Counting sort is used when we know the data is in a given range
Say all the data elements lie within a given range say 1 to 10
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] array = {3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9, 1};
        new CountingSort().sort(array);
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
    }

    private void sort(int[] array) {
        //creating a temp array assuming maximum number in the
        //array to be sorted is 10
        int[] temporaryArray = new int[11];
        for (int element : array) {
            temporaryArray[element]++;
        }
        int index = 0;
        for (int counter = 0; counter < temporaryArray.length; counter++) {
            int value = temporaryArray[counter];
            while (value != 0) {
                array[index] = counter;
                index++;
                value--;
            }
        }
    }
}