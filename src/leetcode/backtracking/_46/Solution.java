package leetcode.backtracking._46;

import java.util.*;

class Solution {
    void getPermutations(int[] nums, int currentIndex, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }
        for (int i = 0; i <= permutation.size(); i++) {
            var permutationCandidate = new ArrayList<Integer>(permutation);
            permutationCandidate.add(i, nums[currentIndex]);
            getPermutations(nums, currentIndex + 1, permutationCandidate, permutations);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        var permutations = new ArrayList<List<Integer>>();
        var permutation = new ArrayList<Integer>();
        getPermutations(nums, 0, permutation, permutations);
        return permutations;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 3}));
    }
}
