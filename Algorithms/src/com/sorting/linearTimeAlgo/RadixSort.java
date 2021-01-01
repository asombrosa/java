package com.sorting.linearTimeAlgo;


import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        new RadixSort().sort(array);
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
    }

    private void sort(int[] array) {
        int maximumElement = max(array);
        for (int place = 1; maximumElement / place > 0; place *= 10) {
            countSort(array, place);
        }
    }

    private void countSort(int[] array, int place) {
        int lengthOfArray = array.length;
        int[] output = new int[lengthOfArray];
        int[] count = new int[10];

        //add count of digit in count array
        for (int element : array) {
            count[(element / place) % 10]++;
        }

        //make count array cumulative
        for (int index = 1; index < 10; index++) {
            count[index] += count[index - 1];
        }

        //populating output array
        for (int index = lengthOfArray - 1; index >= 0; index--) {
            output[count[(array[index] / place) % 10] - 1] = array[index];
            count[(array[index] / place) % 10]--;
        }

        //copy contents of output array to actual array
        for (int index = 0; index < lengthOfArray; index++) {
            array[index] = output[index];
        }

    }

    private int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}
