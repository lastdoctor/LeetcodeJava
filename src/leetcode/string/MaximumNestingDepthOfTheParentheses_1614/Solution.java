package leetcode.string.MaximumNestingDepthOfTheParentheses_1614;

import java.util.ArrayDeque;
import java.util.Deque;

// Time O(n)
// Space O(n)
class Solution {
    public int maxDepth(String s) {
        Deque st = new ArrayDeque();

        int ans = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
                ans = Math.max(ans, st.size());
            }

            if (c == ')') {
                st.pop();
            }
        }

        return ans;
    }
}
