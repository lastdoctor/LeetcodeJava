package leetcode.sliding_window._905;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < nums.length) {
            if (nums[index2] % 2 == 0) {
                int temp = nums[index1];
                nums[index1] = nums[index2];
                nums[index2] = temp;

                index1++;
            }
            index2++;
        }

        return nums;
    }
}


class Solution1 {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[end] % 2 == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
            } else {
                end--;
            }
        }

        return nums;
    }
}
