package com.company.array.BestTimeToBuyAndSellStock_121;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxProfit(int[] prices) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < prices.length; i++) {
            int profit = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit)
                    profit = prices[j] - prices[i];
            }
            set.add(profit);
            profit = 0;
        }
        return Collections.max(set);
    }
}

class Solution1 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }

        }
        return maxprofit;
    }
}

class Main {
    public static void main(String... arsg) {
        Solution s = new Solution();
        int[] nums = {7, 1, 5, 3, 6, 4};
        s.maxProfit(nums);
    }
}