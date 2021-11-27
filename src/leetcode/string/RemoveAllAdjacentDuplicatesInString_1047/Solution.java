package leetcode.string.RemoveAllAdjacentDuplicatesInString_1047;

import java.util.Stack;

// Time O(2n)
// Space O(n)
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        StringBuilder ans = new StringBuilder();

        char prev = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        for (char c : st) {
            ans.append(c);
        }
        return ans.toString();
    }
}
