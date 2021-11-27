package leetcode.string.RansomNote_383;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if(map.containsKey(c)) {
                if(map.get(c) == 1) {
                    map.remove(c);
                }
                else {
                    map.put(c, map.get(c) - 1);
                }
            }
        }

        return map.size() == 0;
    }
}
