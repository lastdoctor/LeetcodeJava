package leetcode.string._1332;

class Solution {
    boolean palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public int removePalindromeSub(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (palindrome(s)) {
            return 1;
        }

        return 2;
    }
}
