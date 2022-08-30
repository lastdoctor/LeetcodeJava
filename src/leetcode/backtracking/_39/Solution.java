package leetcode.backtracking._39;

import java.util.*;

class Solution {
    void getCombination(int currentSum, int target, int startIndex, int[] candidates, List<Integer> candidate, List<List<Integer>> combinations) {
        if (currentSum > target) return;
        if (currentSum == target) {
            combinations.add(new ArrayList<>(candidate));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            int num = candidates[i];
            candidate.add(num);
            getCombination(currentSum + num, target, i, candidates, candidate, combinations);
            candidate.remove(candidate.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        var combinations = new ArrayList<List<Integer>>();
        var candidate = new ArrayList<Integer>();
        int currentSum = 0;
        int startIndex = 0;
        getCombination(currentSum, target, 0, candidates, candidate, combinations);

        return combinations;
    }
}
