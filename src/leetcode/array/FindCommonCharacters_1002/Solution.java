package leetcode.array.FindCommonCharacters_1002;

import java.util.*;

// Space O(n^2) Time O(n^2)
class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i), 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                char currchar = words[i].charAt(j);

                if (map.containsKey(currchar)) {
                    temp.put(currchar, Math.min(map.get(currchar), temp.getOrDefault(currchar, 0) + 1));
                }
            }
            map = temp;
        }

        for (char c : map.keySet()) {
            for (int i = 0; i < map.get(c); i++) {
                list.add("" + c);
            }
        }

        return list;
    }
}
