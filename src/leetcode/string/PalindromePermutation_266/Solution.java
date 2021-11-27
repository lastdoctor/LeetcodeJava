package leetcode.string.PalindromePermutation_266;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (int key : map.values()) {
            if (key % 2 != 0) count++;
        }
        return count == 1 || count == 0;
    }
}

class Solution1 {
    public boolean canPermutePalindrome(String s) {
        boolean[] letters = new boolean[26];
        int oddCount = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') continue;
            int cCode = c - 'a';
            letters[cCode] = !letters[cCode];
            if (letters[cCode]) oddCount++;
            else oddCount--;
        }

        return oddCount <= 1;
    }
}