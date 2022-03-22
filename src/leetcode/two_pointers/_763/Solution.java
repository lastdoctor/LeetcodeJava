package leetcode.two_pointers._763;

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, i);
        }

        var ans = new ArrayList<Integer>();
        int prev = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            max = Math.max(max, map.get(c));
            if (max == i) {
                ans.add(max - prev);
                prev = max;
            }
        }

        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        var s = new Solution().partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(s);
    }
}
