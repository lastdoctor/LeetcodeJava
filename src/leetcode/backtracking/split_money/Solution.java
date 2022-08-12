package leetcode.backtracking.split_money;

public class Solution {
    public static void main(String[] args) {
        var s = new Solution().getSplitWays(30, 0, new int[]{25, 10, 5});
        System.out.println(s);
    }

    int getSplitWays(int amount, int coinIndex, int[] coins) {
        if (amount < 0) return 0;
        if (amount == 0) return 1;
        int splitways = 0;
        while (coinIndex < coins.length) {
            int amountWithoutCoin = amount - coins[coinIndex];
            splitways += getSplitWays(amountWithoutCoin, coinIndex, coins);
            coinIndex++;
        }

        return splitways;
    }
}

class Solution1 {
    public static void main(String[] args) {
        var s = new Solution1().moneyExchange();
        System.out.println(s);
    }

    int count = 0;

    void exchange(int amount) {
        if (amount < 0) return;
        if (amount == 0) {
            count++;
            return;
        }
        if (amount >= 25) {
            exchange(amount - 25);
        }
        if (amount >= 10) {
            exchange(amount - 10);
        }
        if (amount >= 5) {
            exchange(amount - 5);
        }
    }

    int moneyExchange() {
        exchange(30);
        return count;
//        return count; // код не работает возвращает 15
    }
}
