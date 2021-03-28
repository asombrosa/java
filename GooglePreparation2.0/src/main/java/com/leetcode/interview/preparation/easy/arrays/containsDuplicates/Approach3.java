package com.leetcode.interview.preparation.easy.arrays.containsDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Time complexity: O(n log n)
Space complexity : O(1)
 */
public class Approach3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 1; index++) {
            if(nums[index] == nums[index + 1]) {
                return true;
            }
        }
        return false;
    }
}
