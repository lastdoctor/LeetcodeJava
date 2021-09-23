package com.company.array.BuildArrayFromPermutation_1920;


// Space O(n) Time O(n)
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

// Space O(1) Time O(2n)
class Solution1 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] += (nums[nums[i]]%n)*n;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] /= n;
        }

        return nums;
    }
}