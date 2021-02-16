package com.interview.questions.sde2.kLargestElementInArray;

import java.util.Stack;

/*
For example, if given array is [1, 23, 12, 9, 30, 2, 50]
and you are asked for the largest 3 elements i.e., k = 3
then your program should print 50, 30 and 23.
 */
public class Approach1 {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 7, 2, 0, 4, 3};
        int k = 4;
        printKLargestNumbers(array, k);
    }

    private static void printKLargestNumbers(int[] array, int k) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            while (!s1.isEmpty() && s1.peek() < array[i]) {
                s2.add(s1.pop());
            }
            s1.add(array[i]);
            while (!s2.isEmpty()) {
                s1.add(s2.pop());
            }
        }
        s1.stream().limit(k).forEach(System.out::println);
    }
}
