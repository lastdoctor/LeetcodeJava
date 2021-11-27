package leetcode.array.MissingNumber_268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


// Sort and Iteration
// Space complexity O1 and Time complexity O(2nlgn)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        } else if (nums[0] != 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return -1;
    }
}

// Gauss' Formula
// Space complexity O1 and Time complexity O(n)
// [3,0,1] example
class Solution1 {
    public int missingNumber(int[] nums) {
        // 3*4/2 = 6 expectedSum = 6
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // actualSum = 4
        // 6 - 4
        return expectedSum - actualSum;
    }
}

// XOR Solution
// Space complexity O(1) and Time complexity O(n)
// Example [3,0,1]
class Solution2 {
    public int missingNumber(int[] nums) {
        int missing = nums.length; // 3
        for (int i = 0; i < nums.length; i++) {
            missing ^= i; // 3 -> 11 ^ 0 = 11 -> 3 // 0 -> 00 ^ 01 = 01 -> 1 // 01 ^ 10 = 11
            missing ^= nums[i]; // 3 -> 11 ^ 11 -> 00 // 1 -> 01 ^ 00 = 01 // 11 ^ 01 = 10 -> 2
        }
        // 10 -> 2 wow
        return missing;
    }
}

// TODO `Understand`
// Binary Search and Sort
// Space complexity O1 and Time complexity O(2nlgn)
// Example [3,0,1]
class Solution3 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid;
        while (left < right) { // 0 < 3
            mid = (left + right) / 2; // (0 + 3)/2 = 1.5 -> 1
            if (nums[mid] > mid) { // 0 > 1
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}