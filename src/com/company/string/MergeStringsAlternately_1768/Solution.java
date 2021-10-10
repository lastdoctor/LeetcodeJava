package com.company.string.MergeStringsAlternately_1768;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int p1 = 0, p2 = 0;
        while(p1 < word1.length() || p2 < word2.length()) {
            if (p1 < word1.length()) {
                ans.append(word1.charAt(p1));
                p1++;
            }
            if (p2 < word2.length()) {
                ans.append(word2.charAt(p2));
                p2++;
            }
        }
        return ans.toString();
    }
}
