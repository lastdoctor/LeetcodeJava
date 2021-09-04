package com.company.array.NumberOfGoodPairs_1512;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Integer num : map.values()) {
            ans += num * (num - 1) / 2;
        }
        return ans;
    }
}
