package leetcode.array.RomanToInteger_13;

import java.util.HashMap;
import java.util.Map;

// Time O(n) and Space O(1)
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int prev = 0;
        for (char c : s.toCharArray()) {
            int value = map.get(c);
            if (value <= prev) {
                ans += value;
            } else {
                ans += value;
                ans -= 2 * prev;
            }
            prev = value;
        }

        return ans;
    }
}
