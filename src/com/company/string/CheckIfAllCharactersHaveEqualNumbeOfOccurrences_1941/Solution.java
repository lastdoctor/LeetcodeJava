package com.company.string.CheckIfAllCharactersHaveEqualNumbeOfOccurrences_1941;

// TIme O(n) Space (1)
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] en = new int[26];
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            en[i] += 1;
        }


        int prev = en[s.charAt(0) -'a'];
        for (int num : en) {
            if (num != 0 && num != prev) return false;
        }
        return true;
    }
}
