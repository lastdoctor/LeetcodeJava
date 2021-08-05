package com.company.math.PalindromeNumber_9;


// Time O(n) and Space O(1)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0, prev, tmp = x;
        while (tmp != 0) {
            prev = tmp % 10;
            tmp /= 10;
            reverse = reverse * 10 + prev;
        }
        return x == reverse;
    }
}


// Not good Solution pass 11500/11510
// Time O(n) and Space O(N)
class Solution1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        String str =  Integer.toString(x);
        boolean pal = false;
        for (int i = 0; i < str.length() / 2; i++) {
            int left = 0, right = str.length() - 1;
            if (str.charAt(left) == str.charAt(right)) {
                pal = true;
            } else {
                return false;
            }
            left++;
            right--;
        }
        return pal;
    }
}