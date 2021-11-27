package leetcode.array.TwoSum_1;

import java.util.HashMap;
import java.util.Map;

// Two loops
// Time complexity: O(n^2) and Space complexity O(1);
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

// Hashtable
// Time complexity O(n) and Time complexity O(n);
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (table.containsKey(complement)) {
                return new int[]{table.get(complement), i};
            } else {
                table.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

// S