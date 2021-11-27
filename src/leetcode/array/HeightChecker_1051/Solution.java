package leetcode.array.HeightChecker_1051;

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

class Solution1 {
    public int heightChecker(int[] heights) {
        int[] s = new int[101];
        int res = 0, j = 0;

        for (int height : heights) {
            s[height]++;
        }

        for (int i = 1; i < 101; i++) {
            while (s[i] > 0) {
                if(heights[j] != i) res++;
                j++;
                s[i]--;
            }
        }

        return res;
    }
}