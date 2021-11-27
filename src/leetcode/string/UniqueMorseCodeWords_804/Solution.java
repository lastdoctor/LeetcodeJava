package leetcode.string.UniqueMorseCodeWords_804;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for (String str : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                int i = c - 'a';
                sb.append(morse[i]);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}
