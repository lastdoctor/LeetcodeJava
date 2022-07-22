package leetcode.hashmap;

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                int dif = Math.abs(i - map.get(num));
                if (dif <= k) {
                    return true;
                }
            }

            map.put(num, i);
        }

        return false;
    }
}
