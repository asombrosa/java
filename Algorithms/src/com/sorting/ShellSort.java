package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {

    public static void main(String[] args) {
        int lengthOfArray = 100000;
        Integer[] data = new Integer[lengthOfArray];
        Random random = new Random(System.currentTimeMillis());

        for (int index = 0; index < lengthOfArray; index++) {
            data[index] = random.nextInt(100001);
        }
        System.out.println("Array to be sorted: ");
        Arrays.stream(data).forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        long start = System.currentTimeMillis();
        new ShellSort().sort(data);
        long end = System.currentTimeMillis();
        System.out.println("Takes " + (end - start) + " millis for Shell Sort");
        System.out.println("Sorted Array: ");
        Arrays.stream(data).forEach(integer -> System.out.print(integer + " "));
    }

    private void sort(Integer[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        int knuthNum = findMaxKnuthSequenceNumber(data.length);
        while (knuthNum >= 1) {
            for (int index = 0; index < knuthNum; index++) {
                insertionSortWithGap(data, index, knuthNum);
            }
            knuthNum = (knuthNum - 1) / 3;
        }
    }

    private void insertionSortWithGap(Integer[] data, int startIndex, int gap) {
        int index = startIndex;
        while (index < data.length) {
            int currentElement = data[index];
            int indexOfPreviousNumber = index - gap;
            while (indexOfPreviousNumber >= 0 && data[indexOfPreviousNumber] > currentElement) {
                data[indexOfPreviousNumber + gap] = data[indexOfPreviousNumber];
                indexOfPreviousNumber = indexOfPreviousNumber - gap;
            }
            data[indexOfPreviousNumber + gap] = currentElement;
            index = index + gap;
        }
    }

    private int findMaxKnuthSequenceNumber(int size) {
        int h = 1;
        while (h < size / 3) {
            //Knuth formula h = 3 * h + 1
            h = 3 * h + 1;
        }
        return h;
    }
}
