package leetcode.two_pointers._977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        int sortedIndex = n - 1;
        int start = 0;
        int end = n - 1;

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

class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sorted = solution.sortedSquares(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}
