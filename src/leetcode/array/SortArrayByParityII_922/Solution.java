package leetcode.array.SortArrayByParityII_922;

// Time O(n) Space O(n)
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int ieven = 0, iodd = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[ieven] = num;
                ieven += 2;
            } else {
                ans[iodd] = num;
                iodd += 2;
            }
        }

        return ans;
    }
}
