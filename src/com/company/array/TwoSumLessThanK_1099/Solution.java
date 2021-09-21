package com.company.array.TwoSumLessThanK_1099;

import java.util.Arrays;

// Space O(N(log(n)))
class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);

        int p1 = 0, p2 = nums.length -1, ans = -1;
        while (p1 < p2) {
            int sum = nums[p1] + nums[p2];
            if (sum < k) {
                ans = Math.max(sum, ans);
                p1++;
            } else {
                p2--;
            }
        }

        return ans;
    }
}
