package leetcode.array._169;

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return 0;
    }
}
