package leetcode.dynamic.BestTimeToBuyAndSellStock_121;

// Time O(n) and Space 0(1);
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            int curPrice = prices[i];

            if (curPrice < minPrice) {
                minPrice = curPrice;
            }

            if (curPrice - minPrice > maxProfit) {
                maxProfit = curPrice - minPrice;
            }
        }

        return maxProfit;
    }
}