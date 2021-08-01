package com.company.array.RemoveDuplicatesFromSortedArray_26;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                unique++;
            }
            nums[i - unique] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return nums.length - unique;
    }
}