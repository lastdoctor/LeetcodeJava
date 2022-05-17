package leetcode.sliding_window._1984;

import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) return 0;

        // [1 4 7 9 15], k = 3
        Arrays.sort(nums);
        int windowStart = 0;
        int windowEnd = k - 1;
        int minimalDiff = Integer.MAX_VALUE;

        // [1 4 7 9 15], k = 3
        while (windowEnd < nums.length) {
            int currDiff = Math.abs(nums[windowStart] - nums[windowEnd]);
            minimalDiff = Math.min(minimalDiff, currDiff);
            windowStart++;
            windowEnd++;
        }

        return minimalDiff;
    }
}
