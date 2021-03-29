package com.leetcode.interview.preparation.easy.arrays.containsDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Time complexity: O(n log n)
 */
public class Approach2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<>();
        Arrays.sort(nums);
        for(int num : nums) {
            if(list.contains(num)) {
                return true;
            } else {
                list.add(num);
            }
        }
        return false;
    }
}
