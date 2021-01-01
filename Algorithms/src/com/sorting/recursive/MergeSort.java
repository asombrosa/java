package com.sorting.recursive;

import java.util.Arrays;

public class MergeSort {
    public void mergeStep(int[] arr, int start, int middle, int end) {
        int sizeOfLeftArray = middle - start + 1;
        int sizeOfRightArray = end - middle;
        int[] leftArray = new int[sizeOfLeftArray];
        int[] rightArray = new int[sizeOfRightArray];
        int i = 0;
        while (i < sizeOfLeftArray) {
            leftArray[i] = arr[start + i];
            i++;
        }
        int j = 0;
        while (j < sizeOfRightArray) {
            rightArray[j] = arr[middle + 1 + j];
            j++;
        }
        i = 0;
        j = 0;
        int k;
        for (k = start; (k <= end && i < sizeOfLeftArray && j < sizeOfRightArray); k++) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
        }
        while (i < sizeOfLeftArray) {
            arr[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < sizeOfRightArray) {
            arr[k] = rightArray[j];
            k++;
            j++;
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            mergeStep(arr, start, middle, end);
        }
    }

    public static void main(String[] args) {
        int[] arrayToBeSorted = {23, 5, 2, 8, 12, 7, 16, 9};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arrayToBeSorted, 0, 7);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}