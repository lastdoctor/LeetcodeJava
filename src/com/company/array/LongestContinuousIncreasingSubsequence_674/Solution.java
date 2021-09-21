package com.company.array.LongestContinuousIncreasingSubsequence_674;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int curmax = 1;
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int prev = nums[i-1];

            if (prev < cur) {
                curmax++;
            } else {
                max = Math.max(max, curmax);
                curmax = 1;
            }
        }

        return Math.max(max, curmax);
    }
}
