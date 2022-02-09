package leetcode.array.K_diffPairsinanArray_532;

import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        int ans = 0;

        var map = new HashMap<Integer, Integer>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);


        for (var entry : map.entrySet()) {
            int x = entry.getKey();
            int value = entry.getValue();

            if (k > 0 && map.containsKey(x + k)) {
                ans++;
            } else if (k == 0 && value > 1) {
                ans++;
            }
        }


        return ans;
    }
}
