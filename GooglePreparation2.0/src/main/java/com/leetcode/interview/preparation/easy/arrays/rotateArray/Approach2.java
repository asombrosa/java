package com.leetcode.interview.preparation.easy.arrays.rotateArray;

/*
Using extra array
Complexity Analysis

Time complexity: O(n). One pass is used to put the numbers in the new array.
And another pass to copy the new array to the original one.

Space complexity: O(n). Another array of the same size is used.
 */
public class Approach2 {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
