package com.leetcode.interview.preparation.easy.arrays.bestTimeToSellTheStock;

/*
Time complexity : O(n)
 */
public class Approach1 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2 || (prices.length == 2 && prices[1] - prices[0] < 0)) {
            return 0;
        } else if (prices.length == 2) {
            return prices[1] - prices[0];
        }
        int buy = -1;
        int sell = -1;
        int profit = 0;
        for (int price : prices) {
            if (price > sell && sell != -1) { // sell at higher rate
                profit -= sell;
                sell = price;
                profit += sell;
                buy = -1;
            } else if (price < sell && buy == -1) { // make it buying price
                buy = price;
                profit -= buy;
                sell = -1;
            } else if (price < buy) { // discard previous buy price, take this
                profit += buy;
                buy = price;
                profit -= buy;
                sell = -1;
            } else if (buy == -1 && sell == -1) { //first time buy
                buy = price;
                profit -= buy;
                sell = -1;
            } else if (sell == -1) {
                sell = price;
                profit += sell;
                buy = -1;
            }
        }
        if (sell == -1) {
            profit += buy;
        }
        return profit;
    }
}
