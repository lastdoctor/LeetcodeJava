package leetcode.backtracking._22;

import java.util.*;

class Solution {
    void permutation(List<String> gp, String candidate, int open, int close, int limit) {
        if (candidate.length() == limit * 2) {
            gp.add(candidate);
            return;
        }
        if (open < limit) permutation(gp, candidate + "(", open + 1, close, limit);
        if (close < open) permutation(gp, candidate + ")", open, close + 1, limit);
    }

    public List<String> generateParenthesis(int n) {
        var gp = new ArrayList<String>();
        permutation(gp, "", 0, 0, n);
        return gp;
    }
}
