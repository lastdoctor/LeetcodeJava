package leetcode.string.SplitAStringInBalancedStrings_1221;

class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0, r = 0, l = 0;

        for (char c : s.toCharArray()) {
            if (c == 'R') r++;
            if (c == 'L') l++;
            if (r == l) ans++;
        }

        return ans;
    }
}
