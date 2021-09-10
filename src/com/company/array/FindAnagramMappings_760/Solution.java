package com.company.array.FindAnagramMappings_760;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Integer> n2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            n2.put(nums2[i], i);
        }

        int idx = 0;
        for (int num : nums1) {
            if (n2.containsKey(num)) nums2[idx] = n2.get(num);
            idx++;
        }
        return nums2;
    }
}
