package com.leetcode.interview.preparation.easy.arrays.singleNumber;

import java.util.Arrays;

/*
Time complexity : O(n log n)
 */
public class Approach1 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        while (index < nums.length - 1) {
            if(nums[index] == nums[index + 1]) {
                nums[index + 1] = -1;
                nums[index] = -1;
                index += 2;
            } else {
                return nums[index];
            }
        }
        if(nums[index] != -1) {
            return nums[index];
        }
        return -1;
    }
}
