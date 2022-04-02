package leetcode.two_pointers._283;

class Solution {
    public void moveZeroes(int[] nums) {
        int emptyValueIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[emptyValueIndex] = nums[i];
                nums[i] = 0;
                emptyValueIndex++;
            }
        }
    }
}
