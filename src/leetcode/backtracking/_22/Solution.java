package leetcode.backtracking._22;

import java.util.*;

class Solution {
    void generate(List<String> gp, int openBracket, int closeBracket, int limit, String candidate) {
        if (candidate.length() == limit * 2) {
            gp.add(candidate);
            return;
        }
        if (openBracket < limit) {
            generate(gp, openBracket + 1, closeBracket, limit, candidate + "(");
        }
        if (closeBracket < openBracket) {
            generate(gp, openBracket, closeBracket + 1, limit, candidate + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        int openBracket = 0;
        int closeBracket = 0;
        var generatedParentheses = new ArrayList<String>();
        generate(generatedParentheses, openBracket, closeBracket, n, "");

        return generatedParentheses;
    }
}
