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

class Solution1 {
    public List<String> letterCasePermutation(String s) {
        var list = new ArrayList<String>();
        helper(s.toCharArray(), list, 0);
        return list;
    }
    void helper(char[] chs, List<String> list, int pos) {
        if (pos == chs.length) {
            list.add(new String(chs));
            return;
        }
        if (chs[pos] >= '0' && chs[pos] <= '9') {
            helper(chs, list, pos + 1);
            return;
        }
        chs[pos] = Character.toLowerCase(chs[pos]);
        helper(chs, list, pos + 1);

        chs[pos] = Character.toUpperCase(chs[pos]);
        helper(chs, list, pos + 1);
    }
}