package com.company.string.CheckIfTheSentenceIsPangram_1832;

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ans = new boolean[26];

        for (char c : sentence.toCharArray()) {
            ans[c - 'a'] = true;
        }

        for (boolean b : ans) {
            if (b == false) {
                return false;
            }
        }
        return true;
    }
}
