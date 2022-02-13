package leetcode.string.ValidPalindromeII_680;

import java.util.*;

class Solution {
    private boolean isPalindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                if (isPalindrome(s, start + 1, end)) {
                    return true;
                }
                if (isPalindrome(s, start, end - 1)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
