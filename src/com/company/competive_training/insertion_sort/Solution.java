package com.company.competive_training.insertion_sort;

public class Solution {
    public void insertion_sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int div = i - 1;
            while(div >= 0 && nums[div] > key){
                nums[div + 1] = nums[div];
                div--;
            }
            nums[div + 1] = key;
        }
    }
}

class Main {
    public static void main(String... args) {
        Solution s = new Solution();
        int[] nums = {5, 1, 4, 2, 8};
//                   div i
        s.insertion_sort(nums);
    }
}