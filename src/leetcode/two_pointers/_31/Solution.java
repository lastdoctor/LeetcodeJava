package leetcode.two_pointers._31;

class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int end = nums.length - 1;
            while (nums[end] <= nums[i]) {
                end--;
            }
            swap(nums, i, end);
        }

        reverse(nums, i + 1);
    }
}
