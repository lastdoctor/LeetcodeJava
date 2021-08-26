package com.company.string.CountTheNumberOfConsistentStrings_1684;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        s.countConsistentStrings(allowed, words);
    }
}
