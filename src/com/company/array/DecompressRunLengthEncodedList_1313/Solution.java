package com.company.array.DecompressRunLengthEncodedList_1313;

import java.util.Arrays;

// Time O(2n) Space O(n)
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;

        for (int i = 0; i < nums.length; i+=2) {
            n += nums[i];
        }

        int[] ans = new int[n];
        int idx = 0;
        for (int i = 0; i < nums.length; i+= 2) {
            Arrays.fill(ans, idx, idx + nums[i], nums[i + 1]);
            idx += nums[i];
        }
        return ans;
    }
}
