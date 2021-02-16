package com.interview.questions.sde2.kLargestElementInArray;

import java.util.Stack;

/*
For example, if given array is [1, 23, 12, 9, 30, 2, 50]
and you are asked for the largest 3 elements i.e., k = 3
then your program should print 50, 30 and 23.
 */
public class Approach1Using1Stack {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 7, 2, 0, 4, 3};
        int k = 4;
        printKLargestNumbers(array, k);
    }

    private static void printKLargestNumbers(int[] array, int k) {
        Stack<Integer> s1 = new Stack<>();
        s1.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            int index = s1.size() - 1;
            int value = s1.elementAt(index);
            while (index > 0 && value < array[i]) {
                index = index - 1;
                value = s1.elementAt(index);
            }
            if (value < array[i]) {
                s1.add(index, array[i]);
            } else {
                s1.add(index + 1, array[i]);
            }
        }
        s1.stream().limit(k).forEach(System.out::println);
    }
}
