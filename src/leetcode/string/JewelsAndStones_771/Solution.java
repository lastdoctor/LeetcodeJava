package leetcode.string.JewelsAndStones_771;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        int ans = 0;
        for (char c : stones.toCharArray()) {
            if(set.contains(c)){
                ans++;
            }
        }
        return ans;
    }
}