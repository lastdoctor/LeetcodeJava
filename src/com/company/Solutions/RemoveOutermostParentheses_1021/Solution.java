package com.company.Solutions.RemoveOutermostParentheses_1021;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeOuterParentheses(String s) {
        Deque st = new ArrayDeque();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') st.push(c);

            if (st.size() > 1) ans.append(c);

            if (c == ')') st.pop();
        }
        return ans.toString();
    }
}
