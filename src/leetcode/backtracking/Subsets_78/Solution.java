package leetcode.backtracking.Subsets_78;

import java.util.*;

class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    private void btr(List<Integer> temp, int[] nums, int start) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            btr(temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        var temp = new ArrayList<Integer>();
        btr(temp, nums, 0);
        return ans;
    }
}
