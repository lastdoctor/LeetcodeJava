package leetcode.backtracking._216;

import java.util.*;

class Solution {
    void findCombination(int startIndex, int sum, int k, List<Integer> combination, List<List<Integer>> combinations) {
        if (sum == 0 && k == combination.size()) {
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if (combination.size() >= k) return;
        for (int i = startIndex; i <= 9; i++) {
            combination.add(i);
            findCombination(i + 1, sum - i, k, combination, combinations);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        var combinations = new ArrayList<List<Integer>>();
        findCombination(1, n, k, new ArrayList<Integer>(), combinations);
        return combinations;
    }
}
