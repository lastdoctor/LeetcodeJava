package leetcode.array.SingleNumber_136;

import java.util.HashMap;
import java.util.Map;

// Time On2 Space On
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return 0;
    }
}

// Time On and Space O1
class Solution2 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums){
            single ^= num;
        }
        return single;
    }
}
// XOR table
// 1 1 0
// 0 1 1
// 1 0 1
// 0 0 0
// 2 ^ 2 ^ 1 -> 10 ^ 10 ^ 01 = 01
// 4 ^ 1 ^ 2 ^ 1 ^ 2 = 100 ^ 001 ^ 010 ^ 001 ^ 010 = 100