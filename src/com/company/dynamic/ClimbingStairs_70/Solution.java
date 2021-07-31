package com.company.dynamic.ClimbingStairs_70;

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        // n = 4
        // 1+1+1 = 3a
        // 1+2 = 3
        // 2+1 = 3
        int res = 1, b = 1;
        for (int i = 0; i < n; i++) {
            res = b;
            b = res + b;
        }
        return b;
    }
}
