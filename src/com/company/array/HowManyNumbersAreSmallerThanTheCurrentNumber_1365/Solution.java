package com.company.array.HowManyNumbersAreSmallerThanTheCurrentNumber_1365;

import java.util.HashSet;
import java.util.Set;

// TIme complexity O(n^2) and Space complexity O(1);
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        int counter = 0;
        int idx = 0;
        for(int i : nums) {
            for(int j : nums) {
                if (i > j) {
                    counter++;
                }
            }
            ans[idx] = counter;
            idx++;
            counter = 0;
        }

        return ans;
    }
}