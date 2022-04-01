package leetcode.two_pointers._977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        int sortedIndex = n-1;
        int start = 0;
        int end = n-1;

        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                sorted[sortedIndex] = nums[start] * nums[start];
                start++;
                sortedIndex--;
            } else {
                sorted[sortedIndex] = nums[end] * nums[end];
                end--;
                sortedIndex--;
            }
        }

        return sorted;
    }
}
