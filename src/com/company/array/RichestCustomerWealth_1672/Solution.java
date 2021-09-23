package com.company.array.RichestCustomerWealth_1672;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] i : accounts) {
            int curmax = 0;
            for (int j : i) {
                curmax += j;
            }
            max = Math.max(max, curmax);
        }
        return max;
    }
}
