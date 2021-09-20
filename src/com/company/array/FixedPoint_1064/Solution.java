package com.company.array.FixedPoint_1064;

class Solution {
    public int fixedPoint(int[] arr) {
        int idx = 0;
        for (int num : arr) {
            if (num == idx) return idx;
            idx++;
        }
        return -1;
    }
}
