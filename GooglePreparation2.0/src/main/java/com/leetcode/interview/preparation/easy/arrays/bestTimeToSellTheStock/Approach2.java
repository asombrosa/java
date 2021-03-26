package com.leetcode.interview.preparation.easy.arrays.bestTimeToSellTheStock;

/*
Time complexity : O(n). Single pass.
 */
public class Approach2 {
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            // find 1st smallest
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            // find 1st largest after valley
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
