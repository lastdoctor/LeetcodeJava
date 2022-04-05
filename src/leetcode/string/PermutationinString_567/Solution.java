package leetcode.string.PermutationinString_567;

import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1chars = new int[26];
        int[] s2chars = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1chars[s1.charAt(i) - 'a']++;
            s2chars[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1chars, s2chars)) return true;
        int s1start = 0;
        int s1end = s1.length();
        while (s1end < s2.length()) {
            s2chars[s2.charAt(s1start) - 'a']--;
            s2chars[s2.charAt(s1end) - 'a']++;

            if (Arrays.equals(s1chars, s2chars)) return true;
            s1start++;
            s1end++;
        }


        return false;
    }
}


class Main {
    public static void main(String... args) {
        var s1 = "ab";
        var s2 = "eidbaooo";

        var s = new Solution().checkInclusion(s1, s2);
        System.out.println(s);
    }
}
