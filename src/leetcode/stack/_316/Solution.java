package leetcode.stack._316;

import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        var lastIndex = new int[26];

        int idx = 0;
        for (char c : s.toCharArray()) {
            lastIndex[c - 'a'] = idx;
            idx++;
        }

        var seen = new boolean[26];
        var stack = new LinkedList<Integer>();

        idx = 0;
        for (char c : s.toCharArray()) {
            int curr = c - 'a';
            if (seen[curr]) continue;
            while (!stack.isEmpty() && stack.peekLast() > curr && idx < lastIndex[stack.peekLast()]) {
                seen[stack.removeLast()] = false;
            }
            stack.addLast(curr);
            seen[curr] = true;
            idx++;
        }

        var ans = new StringBuilder();
        for (int с : stack) {
            ans.append((char) (с + 'a'));
        }

        return ans.toString();
    }
}
