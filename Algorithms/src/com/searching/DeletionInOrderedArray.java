package com.searching;

public class DeletionInOrderedArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 20, 32, 45, 52, 55, 60, 75};
        //int deleteValue = 55;
        //int deleteValue = 3;
        //int deleteValue = 75;
        int deleteValue = -1;
        delete(array, deleteValue);
        print(array);
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void delete(int[] array, int deleteValue) {
        boolean isDeleted = Boolean.FALSE;
        for (int counter = 0; counter < array.length; counter++) {
            if (!isDeleted && deleteValue == array[counter]) {
                array[counter] = 0;
                isDeleted = Boolean.TRUE;

            } else if (isDeleted) {
                array[counter - 1] = array[counter];
                array[counter] = 0;
            }
        }
        if (!isDeleted) {
            System.out.println("Element to be deleted Not found: " + deleteValue);
        }
    }
}
