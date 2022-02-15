package leetcode.string.MaximumScoreAfterSplittingaString_1422;

class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') c1++;
        }

        int max = Integer.MIN_VALUE;
        int c2 = 0;

        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == '0') c2++;
            else c1--;
            max = Math.max(max, c1 + c2);
        }

        return max;
    }
}
