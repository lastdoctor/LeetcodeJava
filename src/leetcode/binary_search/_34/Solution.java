package leetcode.binary_search._34;

class Solution {
    int leftIndex(int[] nums, int target) {
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                idx = mid;
                end = mid - 1;
            } else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return idx;
    }

    int rightIndex(int[] nums, int target) {
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                idx = mid;
                start = mid + 1;
            } else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = leftIndex(nums, target);
        int right = rightIndex(nums, target);

        return new int[]{left, right};
    }
}
