package leetcode.sliding_window._1493;

class Solution {
    public int longestSubarray(int[] nums) {
        int windowStart = -1;
        int windowEnd = 0;
        int firstZeroIndex = -1;
        int maxSequence = 0;
        while (windowEnd < nums.length) {
            if (nums[windowEnd] == 0) {
                int sequence = windowEnd - windowStart - 1;
                maxSequence = Math.max(maxSequence, sequence);
                windowStart = firstZeroIndex + 1;
                firstZeroIndex = windowEnd;
            }
            windowEnd++;
        }
        if (windowStart == -1) {
            return nums.length -1;
        }
        return Math.max(maxSequence, windowEnd - windowStart - 1);
    }
}
