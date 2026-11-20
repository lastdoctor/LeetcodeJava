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

class Solution2 {
    public int removeDuplicates(int[] nums) {
        // nums = [0,1,2,3,4,2,2,3,3,4]
        //         p c
        int prevIdx = 0;
        int currIdx = 1;
        while (currIdx < nums.length) {
            int currCandidate = nums[currIdx];
            int prevCandidate = nums[prevIdx];
            if (prevCandidate == currCandidate) {
                currIdx++;
                continue;
            }
            prevIdx++;
            nums[prevIdx] = currCandidate;
            currIdx++;
        }

        return prevIdx+1;
    }
}
