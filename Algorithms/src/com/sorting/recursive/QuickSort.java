package com.sorting.recursive;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12, 9, 7, 15, 10, 1, 8, 4, 2};
        quicksort(array, 0, array.length - 1);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partitionStep(array, start, end);
            quicksort(array, start, pivot - 1);
            quicksort(array, pivot + 1, end);
        }
    }

    private static int partitionStep(int[] array, int start, int end) {
        int pivot = array[end];
        int index = start;
        for (int loopCounter = start; loopCounter <= end - 1; loopCounter++) {
            if (array[loopCounter] <= pivot) {
                int temp = array[index];
                array[index] = array[loopCounter];
                array[loopCounter] = temp;
                index = index + 1;
            }
        }
        array[end] = array[index];
        array[index] = pivot;
        return index;
    }
}