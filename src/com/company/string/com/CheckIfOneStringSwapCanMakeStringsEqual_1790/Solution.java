package com.company.string.com.CheckIfOneStringSwapCanMakeStringsEqual_1790;

import java.util.Arrays;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] s1a = new int[26];
        int[] s2a = new int[26];
        int count = 0;
        for (int i =0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) count++;
            if (count > 2) return false;
            s1a[c1-'a']++;
            s2a[c2-'a']++;
        }

        return Arrays.equals(s1a, s2a);
    }
}