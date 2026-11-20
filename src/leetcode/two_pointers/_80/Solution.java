package leetcode.two_pointers._80;

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 1;
        for (int currIndex = 2; currIndex < nums.length; currIndex++) {
            int candidate = nums[currIndex];
            int prevPrevValue = nums[prevIndex - 1];
            if (prevPrevValue == candidate) continue;
            prevIndex++;
            nums[prevIndex] = candidate;
        }

        return prevIndex + 1;
    }
}
class Solution2 {
    public int removeDuplicates(int[] nums) {
        // [1,1,1,2,2,3]
        //      p c
        int prevIdx = 1;
        int currIdx = 2;
        while (currIdx < nums.length) {
            int currCandidate = nums[currIdx];
            if (currCandidate == nums[prevIdx - 1]) {
                currIdx++;
                continue;
            }
            prevIdx++;
            nums[prevIdx] = currCandidate;
            currIdx++;
        }

        return prevIdx + 1;
    }
}
