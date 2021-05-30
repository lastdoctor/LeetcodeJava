package com.company.array.RunningSumOf1dArray_1480;

// Time complexity: O(n) and Space complexity: O(1);
class Solution {
    public int[] runningSum(int[] nums) {
        int accum = 0;
        for (int i = 0; i < nums.length; i++) {
            accum += nums[i];
            nums[i] = accum;
        }
        return nums;
    }
}

// Time complexity: O(n) and Space complexity: O(1);
class Solution1 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i is sum of result at `i-1` and element at i`
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}

// Time complexity: O(n) and Space complexity: O(1);
class Solution2 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}