package leetcode.string.DetermineIfStringHalvesAreAlike_1704;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int counter = 0;
        int mid = s.length() / 2;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (set.contains(temp)) {
                if (i < mid) counter++;
                else counter --;
            }
        }

        return counter == 0;
    }
}
