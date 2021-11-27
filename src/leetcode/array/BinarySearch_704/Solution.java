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
        int start = 0, end = nums.length - 1, mid;
        while (start <= end) {
            mid = (start + (end - start)) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}