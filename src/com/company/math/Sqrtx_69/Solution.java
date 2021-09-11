package com.company.math.Sqrtx_69;

class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
        int right = left + 1;
        return (long)right * right > x ? left : right;
    }
}

// Time complexity O(log(n)
// Space complexity O(1)
class Solution1 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int l = 2;
        int r = x / 2;
        long num;
        while (l <= r) {
            int m = (l + r) >>> 1;
            num = (long)m * m;
            if (num == x) {
                return m;
            }
            if (num < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }
}