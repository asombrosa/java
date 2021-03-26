package com.leetcode.interview.preparation.easy.arrays.removeDuplicatesFromArray;

/*
Time complexity : O(n)
 */
public class Approach2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int counterForUniqueElements = 1;
        for(int element : nums) {
            if(nums[counterForUniqueElements - 1] != element){
                nums[counterForUniqueElements++] = element;
            }
        }
        return counterForUniqueElements;
    }
}