package com.company.array.HeightChecker_1051;

import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;

        int[] sortArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortArr);
        for (int i = 0; i < heights.length; i++) {
            if (sortArr[i] != heights[i]) ans++;
        }
        return ans;
    }
}
