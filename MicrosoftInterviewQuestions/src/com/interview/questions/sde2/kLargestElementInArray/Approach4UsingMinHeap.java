package com.interview.questions.sde2.kLargestElementInArray;

import java.util.PriorityQueue;

/*
For example, if given array is [1, 23, 12, 9, 30, 2, 50]
and you are asked for the largest 3 elements i.e., k = 3
then your program should print 50, 30 and 23.

Time complexity : n * k
 */
public class Approach4UsingMinHeap {
    public static void main(String[] args) {
        //int[] array = {6, 9, 1, 7, 2, 4, 3, 5, 0, 8};
        //int[] array = {5, 1, 7, 2, 0, 4, 3, 9};
        int[] array = {5, 1, 7, 2, 0, 4, 3};
        int k = 4;
        printKLargestNumbers(array, k);
    }

    private static void printKLargestNumbers(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //It behaves like min heap
        //i.e parent should be small than its children
        for (int i = 0; i < k; i++) {
            minHeap.add(array[i]);
        }
        for (int i = k; i < array.length; i++) {
            if (!minHeap.isEmpty() && minHeap.peek() <= array[i]) {
                minHeap.poll();
                minHeap.add(array[i]);
            }
        }
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
