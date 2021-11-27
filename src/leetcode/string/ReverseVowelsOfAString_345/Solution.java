package leetcode.string.ReverseVowelsOfAString_345;

import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        if (s.length() < 2) return s;

        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] ans = s.toCharArray();
        int end = s.length() - 1, start = 0;
        while (start < end) {
            if (!set.contains(ans[start])) start++;
            if (!set.contains(ans[end])) end--;

            // swap if start value equals end value
            if (set.contains(ans[start]) && set.contains(ans[end]))  {
                char temp = ans[start];
                ans[start] = ans[end];
                ans[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ans);
    }
}