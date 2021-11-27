package leetcode.array.ConcatenationOfArray_1929;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int secondPart = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[secondPart] = nums[i];
            secondPart++;
        }
        return ans;
    }
}