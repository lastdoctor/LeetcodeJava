package leetcode.two_pointers._26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 0;
        int currIndex = 1;
        // [0,0,1,1,1,2,2,3,3,4]
        while (currIndex < nums.length) {
            int candidate = nums[currIndex];
            int prevValue = nums[prevIndex];
            if(prevValue == candidate) {
                currIndex++;
                continue;
            };
            prevIndex++;
            nums[prevIndex] = candidate;
        }

        return prevIndex + 1;
    }
}
