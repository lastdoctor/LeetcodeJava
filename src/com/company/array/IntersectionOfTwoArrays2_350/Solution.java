package com.company.array.IntersectionOfTwoArrays2_350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Time complexity O(n) and Space complexity O(n)
// Solution HashMap
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect(nums2, nums1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int idx = 0;
        for (int num : nums2) {
            int cnt = map.getOrDefault(num, 0);
            if (cnt > 0) {
                nums1[idx] = num;
                idx++;
                map.put(num, cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1,0, idx);
    }
}

// Array sort
// Time O(nLogn) Space O(logn)
class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}