package leetcode.two_pointers._27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = 0;

        // Input: nums = [3,2,2,3], val = 3
        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            int candidate = nums[currIndex];
            if (candidate == val) {
                continue;
            }
            nums[lastIndex] = candidate;
            lastIndex++;
        }

        return lastIndex;
    }
}
