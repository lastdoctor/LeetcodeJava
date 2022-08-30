package leetcode.backtracking._40;

import java.util.*;

class Solution {
    void getCombination(int startIndex, int currentSum, int[] candidates, List<Integer> candidate, List<List<Integer>> combinations) {
        if (currentSum < 0) return;
        if (currentSum == 0) {
            combinations.add(new ArrayList<>(candidate));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            int num = candidates[i];
            candidate.add(num);
            getCombination(i + 1, currentSum - num, candidates, candidate, combinations);
            candidate.remove(candidate.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        var combinations = new ArrayList<List<Integer>>();
        var candidate = new ArrayList<Integer>();
        var startIndex = 0;
        int currentSum = 0;
        Arrays.sort(candidates);
        getCombination(startIndex, target, candidates, candidate, combinations);

        return combinations;
    }
}
