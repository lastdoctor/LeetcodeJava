package leetcode.string.RemoveVowelsFromAString_1119;

import java.util.HashSet;
import java.util.Set;

// Time O(n) and Space O(1);
class Solution {
    public String removeVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String ans = "";
        for (char c : s.toCharArray()){
            if(!vowels.contains(c)){
                ans += c;
            }
        }
        return ans;
    }
}
