package leetcode.string.ValidPalindromeII_680;

class Solution {
    private boolean validPalindrome(int start, int end, String s) {
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return validPalindrome(start + 1, end, s) || validPalindrome(start, end-1, s);
            }
        }

        return true;
    }
}
