package com.leetcode.interview.preparation.easy.arrays.containsDuplicates;

import java.util.ArrayList;
import java.util.List;

/*
Time complexity : O(n)
Space complexity : O(n)
time exceeds in leet code
 */
public class Approach1 {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
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
