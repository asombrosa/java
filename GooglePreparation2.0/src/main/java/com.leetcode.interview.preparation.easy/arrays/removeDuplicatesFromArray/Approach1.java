package com.leetcode.interview.preparation.easy.arrays.removeDuplicatesFromArray;

public class Approach1 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int j;
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        for(int i = 0; i < nums.length; i++) {
            j = i + 1;
            if(j < nums.length && nums[i] != nums[j]) {
                nums[count++] = nums[i];
            }
        }
        if (count == 0) {
            nums[count++] = nums[nums.length - 1];
            return count;
        }
        if (nums[count - 1] != nums[nums.length - 1] ){
            nums[count++] = nums[nums.length - 1];
            return count;
        }
        return count;
    }
}
