package leetcode.stack._1249;

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        var stack = new LinkedList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isAlphabetic(c)) continue;
            if (c == '(') stack.addLast(i);
            else if (!stack.isEmpty() && s.charAt(stack.peekLast()) == '(') stack.removeLast();
            else stack.addLast(i);
        }

        var ans = new StringBuilder();
        var set = new HashSet<>(stack);
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
