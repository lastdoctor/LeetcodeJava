package com.company.stack.RemoveAllAdjacentDuplicatesInString_1047;

import java.util.Stack;

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
