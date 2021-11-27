package leetcode.string.WordPattern_290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Space On Time On
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarr = s.split(" ");
        if (pattern.length() != sarr.length) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < sarr.length; i++) {
            char c = pattern.charAt(i);

            if (map.containsKey(c)) {
                if (!map.get(c).equals(sarr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(sarr[i])) {
                    return false;
                }

                map.put(c, sarr[i]);
            }
        }

        return true;
    }
}

