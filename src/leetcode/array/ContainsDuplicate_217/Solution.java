package leetcode.array.ContainsDuplicate_217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Time complexity 2NLogN and Space complexity O1
// Sorting Array
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[1]) {
                return true;
            }
        }
        return false;
    }
}

// HashSet
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
