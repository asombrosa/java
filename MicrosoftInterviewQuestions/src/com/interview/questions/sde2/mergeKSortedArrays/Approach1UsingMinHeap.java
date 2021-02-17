package com.interview.questions.sde2.mergeKSortedArrays;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*

Input:
k = 3, n = 4
arr[][] = { {1, 3, 5, 7},
{2, 4, 6, 8},
{0, 9, 10, 11}} ;
Output: 0 1 2 3 4 5 6 7 8 9 10 11
Explanation: The output array is a sorted array that contains all the elements of the input matrix.

Steps :
1. Create a min Heap and insert the first element of all k arrays.
2. Run a loop until the size of MinHeap is greater than zero.
3. Remove the top element of the MinHeap and print the element.
4. Now insert the next element from the same array in which the removed element belonged.
5. If the array doesn't’t have any more elements, then do nothing

 */
public class Approach1UsingMinHeap {
    public static void main(String[] args) {
        Integer[] arrayOne = {1, 12, 13};
        Integer[] arrayTwo = {4, 5, 16};
        Integer[] arrayThree = {0, 11, 15};
        Integer[] arrayFour = {2, 6, 8, 9};
        Integer[] arrayFive = {3, 7, 14};
        mergeArrays(arrayOne, arrayFive, arrayThree, arrayTwo, arrayFour);
    }

    private static void mergeArrays(Integer[]... arrays) {
        PriorityQueue<Integer> sortedElements = new PriorityQueue<>();
        for (Integer[] array : arrays) {
            sortedElements.add(array[0]);
        }
        while (!sortedElements.isEmpty()) {
            int value = sortedElements.peek();
            System.out.println(sortedElements.poll());
            int elementFromArray = getNextElementFromArray(value, arrays);
            if (elementFromArray != -1) {
                sortedElements.add(elementFromArray);
            }
        }
    }

    private static int getNextElementFromArray(int value, Integer[][] arrays) {
        for (Integer[] array : arrays) {
            List<Integer> list = Arrays.asList(array);
            int index = list.indexOf(value);
            if (list.contains(value) && index < list.size() - 1)
                return list.get(index + 1);
        }
        return -1;
    }


}
