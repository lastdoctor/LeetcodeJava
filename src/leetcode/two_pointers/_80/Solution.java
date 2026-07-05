package leetcode.two_pointers._80;

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 1;
        for (int currIndex = 2; currIndex < nums.length; currIndex++) {
            int candidate = nums[currIndex];
            int prevPrevValue = nums[prevIndex - 1];
            if (prevPrevValue == candidate) continue;
            prevIndex++;
            nums[prevIndex] = candidate;
        }

        return prevIndex + 1;
    }
}
