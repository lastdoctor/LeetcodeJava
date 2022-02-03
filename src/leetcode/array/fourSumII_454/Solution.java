package leetcode.array.fourSumII_454;

import java.util.*;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        var map = new HashMap<Integer, Integer>();
        int count = 0;

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                map.put(n1 + n2, map.getOrDefault(n1 + n2, 0) + 1);
            }
        }

        for (int n3 : nums3) {
            for (int n4 : nums4) {
                count += map.getOrDefault(-(n3 + n4), 0);
            }
        }

        return count;
    }
}
