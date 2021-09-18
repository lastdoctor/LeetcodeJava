package com.company.math.LargestNumberAtLeastTwiceOfOthers_747;

class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length < 2) return 0;

        int first = -1, second = -1, idx = 0, ifirst = 0;
        for (int num : nums) {
            if(num > first) {
                second = first;
                first = num;
                ifirst = idx;
            } else if (second < num) second = nums[idx];

            idx++;
        }

        return first >= 2 * second ? ifirst : -1;
    }
}
