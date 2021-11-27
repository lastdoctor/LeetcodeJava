package leetcode.string.Single_RowKeyboard_1165;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }

        int ans = 0;
        int cur = 0;
        for (char c : word.toCharArray()) {
            ans += Math.abs(cur - map.get(c));
            cur = map.get(c);
        }

        return ans;
    }
}
