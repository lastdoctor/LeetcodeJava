package leetcode.bits.FindtheDifference_389;

import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.charAt(0);

        var map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return c;
            }
            map.put(c, count - 1);
        }

        return t.charAt(0);
    }
}

class Solution1 {
    public char findTheDifference(String s, String t) {
        int ans = 0;
        for (int c : s.toCharArray()) {
            ans ^= c;
        }
        for (int c : t.toCharArray()) {
            ans ^= c;
        }
        return (char)ans;
    }
}
