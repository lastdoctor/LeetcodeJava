package leetcode.backtracking.split_money;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        var cache = new HashMap<Integer, Integer>();
        var s = new Solution().getSplitWays(30, 0, new int[]{25, 10, 5}, cache);
        System.out.println(s);
    }

    int getSplitWays(int amount, int coinIndex, int[] coins, Map<Integer, Integer> cache) {
        if (amount < 0) return 0;
        if (amount == 0) return 1;
        int splitways = 0;
        while (coinIndex < coins.length) {
            int amountWithoutCoin = amount - coins[coinIndex];
            if (!cache.containsKey(amountWithoutCoin))
                cache.put(amountWithoutCoin, getSplitWays(amountWithoutCoin, coinIndex, coins, cache));
            splitways += cache.get(amountWithoutCoin);
            coinIndex++;
        }

        return splitways;
    }
}
