package com.company.string.CountTheNumberOfConsistentStrings_1684;

import java.util.HashSet;
import java.util.Set;

//Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//Output: 2
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] letters = new boolean[26];
        int ans = words.length;

        for (char c : allowed.toCharArray()) {
            letters[c - 'a'] = true;
        }

        for (String s : words) {
            for (char c : s.toCharArray()) {
                if (letters[c - 'a'] == false) {
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}

class Solution1 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        int ans = 0;
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        for (String word : words) {
            int temp = 0;
            for (char c : word.toCharArray()) {
                if(set.contains(c)) temp++;
                if(temp == word.length()) ans++;
            }
        }

        return ans;
    }
}