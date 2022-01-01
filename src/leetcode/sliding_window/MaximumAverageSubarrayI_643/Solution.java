package leetcode.sliding_window.MaximumAverageSubarrayI_643;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        int windowStart = 0;
        double max = Integer.MIN_VALUE;
        for (int windowEnd = 0; windowEnd < nums.length; ++windowEnd) {
            windowSum += nums[windowEnd];
            if (windowEnd >= k - 1) {
                double candidate = windowSum / k;
                max = Math.max(candidate, max);

                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return max;
    }
}
