package leetcode.sliding_window._1004;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxSequence = 0;

        int windowStart = 0;
        int windowEnd = 0;
        int zeroCount = 0;
        while (windowEnd < nums.length) {
            if (nums[windowEnd] == 0) zeroCount++;

            if (zeroCount > k) {
                if (nums[windowStart] == 0) zeroCount--;
                int currentSequence = windowEnd - windowStart;
                maxSequence = Math.max(currentSequence, maxSequence);

                windowStart++;
            }
            windowEnd++;
        }

        return Math.max(maxSequence, windowEnd - windowStart);
    }
}
