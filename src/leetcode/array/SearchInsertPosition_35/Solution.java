package leetcode.array.SearchInsertPosition_35;


// Time complexity O(log n) amd Space complexity O(1) 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lowIndex = 0, highIndex = nums.length - 1, midIndex;
        while (lowIndex <= highIndex){
            midIndex = (lowIndex + highIndex) / 2;
            if(nums[midIndex] == target) return midIndex;
            if (nums[midIndex] > target) highIndex = midIndex - 1;
            else lowIndex = midIndex + 1;
        }
        return lowIndex;
    }
}
