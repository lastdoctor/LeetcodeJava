package leetcode.array.ContiguousArray_525;

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }

        var map = new HashMap<Integer, Integer>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) maxLength = Math.max(i + 1, maxLength);
            if (map.containsKey(sum)) maxLength = Math.max(maxLength, i - map.get(sum));
            else map.put(sum, i);
        }
        return maxLength;
    }
}

class Main {
    public static void main(String[] args) {
        var nums = new int[]{1, 0, 1, 0, 1, 1, 1};
        var s = new Solution().findMaxLength(nums);
        System.out.println(s);
    }
}
