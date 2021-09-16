package com.company.string.ReversePrefixOfWord_2000;

// Time O(n)
// Space O(n)
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();

        boolean rev = true;
        for (char c : word.toCharArray()) {
            ans.append(c);
            if (c == ch && rev) {
                ans.reverse();
                rev = false;
            }
        }

        return ans.toString().trim();
    }
}
