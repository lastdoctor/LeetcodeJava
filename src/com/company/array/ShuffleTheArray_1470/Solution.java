package com.company.array.ShuffleTheArray_1470;

// Time complexity: O(n) and Space complexity: O(1);
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[j];
            res[i + 1] = nums[n + j];
            j++;
        }
        return res;
    }
}

// Time complexity: O(n) and Space complexity: O(1);
class Solution1 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[i / 2];
            } else {
                System.out.println(nums[n + i / 2]);
                res[i] = nums[n + i / 2];
            }
        }
        return res;
    }
}