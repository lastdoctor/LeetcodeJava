package leetcode.string.ExcelSheetColumnNumber_171;

import java.util.*;

class Solution {
    public int titleToNumber(String s) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
            int c = i + (int) 'A';
            map.put((char) c, i + 1);
        }

        int ans = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(n - i - 1);
            ans += map.get(c) * Math.pow(26, i);
        }
        ;

        return ans;
    }
}
