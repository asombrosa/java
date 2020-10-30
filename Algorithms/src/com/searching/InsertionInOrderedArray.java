package com.searching;

public class InsertionInOrderedArray {
    public static void main(String[] args) {
        int[] array = {3, 7, 20, 32, 45, 52, 60, 75, 0};
        //int insertValue = 55;
        //int insertValue = 80;
        int insertValue = 2;
        print(array);
        insert(array, insertValue);
        print(array);
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void insert(int[] array, int insertValue) {
        for (int counter = 0; counter < array.length; counter++) {
            if (insertValue < array[counter]) {
                int temp = insertValue;
                insertValue = array[counter];
                array[counter] = temp;
            }
        }
        array[array.length - 1] = insertValue;
    }
}
