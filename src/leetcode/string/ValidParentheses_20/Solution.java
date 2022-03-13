package leetcode.string.ValidParentheses_20;

import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {

        var stack = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.addLast(')');
            else if (c == '{') stack.addLast('}');
            else if (c == '[') stack.addLast(']');
            else if (!stack.isEmpty() && stack.peekLast()==c) stack.removeLast();
            else return false;
        }


        return stack.isEmpty();
    }
}
