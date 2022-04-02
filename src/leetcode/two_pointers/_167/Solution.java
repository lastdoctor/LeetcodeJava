package leetcode.two_pointers._167;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int num = target - nums[start];
            if (num == nums[end]) {
                indices[0] = start + 1;
                indices[1] = end + 1;
                return indices;
            } else if (nums[end] > num) {
                end--;
            } else {
                start++;
            }
        }

        return indices;
    }
}
