package leetcode.array.SumOfDigitsInTheMinimumNumber_1085;

import java.util.Arrays;

// Solution sorted Array
// Time complexity O()
class Solution {
    public int sumOfDigits(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        while (nums[0] > 0) {
            sum += nums[0] % 10;
            nums[0] = nums[0] / 10;
        }
        return (sum % 2 == 0) ? 1 : 0;
    }
}
