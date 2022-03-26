package leetcode.array.BinarySearch_704;

import java.util.Arrays;

// Time complexity Ologn Space complexity
class Solution {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        System.out.println(index);
        if (index > -1) return index;
        return -1;
    }
}

class Solution1 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (end + (end - start)) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
