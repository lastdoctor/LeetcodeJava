package leetcode.math.ArrangingCoins_441;

// Time complexity O(log n)
// Space complexity 0(1)
class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n; // 5
        long current;
        while (l <= r) {
            long m = (l + r) >>> 1;
            current = m * (m + 1) / 2;
            if (current == n) return (int)m;

            if(n < current) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return (int)r;
    }
}