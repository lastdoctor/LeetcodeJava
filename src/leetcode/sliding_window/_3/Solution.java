package leetcode.sliding_window._3;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        if (s.length() == 0) return 0;

        int max = 0;

        int windowStart = 0;
        int windowEnd = 0;
        var set = new HashSet<Character>();
        while (windowEnd < s.length()) {
            char c = s.charAt(windowEnd);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(set.size(), max);
                windowEnd++;
            } else {
                set.remove(s.charAt(windowStart));
                windowStart++;
            }
        }

        return Math.max(max, set.size());
    }
}
// dvdf -> 3
// aab -> 2
// abcabcbb -> 3
// bbbbb -> 1
// pwwkew -> 3
