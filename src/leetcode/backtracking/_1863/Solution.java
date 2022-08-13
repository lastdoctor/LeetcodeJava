package leetcode.backtracking._1863;

class Solution {
    int sumXor(int[] nums, int index, int currentXor) {
        if (nums.length == index) return currentXor;

        int includedCurrentValue = sumXor(nums, index + 1, currentXor ^ nums[index]);

        int excludedCurrentValue = sumXor(nums, index + 1, currentXor);

        return includedCurrentValue + excludedCurrentValue;
    }

    public int subsetXORSum(int[] nums) {
        return sumXor(nums, 0, 0);
    }
}
