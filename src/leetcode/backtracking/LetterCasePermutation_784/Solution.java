package leetcode.backtracking.LetterCasePermutation_784;

import java.util.*;


class Solution {
    public List<String> letterCasePermutation(String s) {
        var q = new LinkedList<String>();
        q.offer(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Character.isDigit()
            if (c >= '0' && c <= '9') continue;
            int size = q.size();
            for (int j = 0; j < size; j++) {
                var cur = q.poll();
                var chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                q.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                q.offer(String.valueOf(chs));
            }

        }

        return new ArrayList<>(q);
    }
}
