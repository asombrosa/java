package com.leetcode.interview.preparation.easy.arrays.rotateArray;

/*
Time complexity : O(n * k)
Space complexity : O(1)
 */
public class Approach1 {
    public void rotate(int[] nums, int k) {
        if(nums.length < 2 || k == 0) {
            return;
        }
        while(true){
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            int temp2;
            for(int i = 1; i < nums.length; i++) {
                temp2 = nums[i];
                nums[i] = temp;
                temp = temp2;
            }
            k--;
            if(k == 0) {
                break;
            }
        }
    }

}
