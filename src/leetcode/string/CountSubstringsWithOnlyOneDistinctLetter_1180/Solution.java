package leetcode.string.CountSubstringsWithOnlyOneDistinctLetter_1180;

public class Solution {
    public int countLetters(String s) {
        int ans = 0;
        int counter = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i -1) == s.charAt(i)) {
                counter++;
                ans += counter;
            }
            else {
                counter++;
                ans += counter;
                counter = 0;
            }
        }

        ans += counter + 1;
        return ans;
    }
}