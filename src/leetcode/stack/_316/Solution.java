package leetcode.stack._316;

import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        var letters = new int[26];

        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        var seen = new boolean[26];
        var stack = new LinkedList<Character>();

        for (char c : s.toCharArray()) {
            int curr = c - 'a';
            letters[curr]--;
            if (seen[curr]) continue;
            while (!stack.isEmpty() && stack.peekLast() > c && 0 < letters[stack.peekLast() - 'a']) {
                seen[stack.removeLast() - 'a'] = false;
            }
            stack.addLast(c);
            seen[curr] = true;
        }

        var ans = new StringBuilder();
        for (int value : stack) {
            ans.append((char) value);
        }

        return ans.toString();
    }
}


class Main {
    public static void main(String[] arsg) {
        var s = new Solution().removeDuplicateLetters("cbbbcaa");
        System.out.println(s);
    }
}
