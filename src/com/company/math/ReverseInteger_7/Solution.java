package com.company.math.ReverseInteger_7;


//Input: x = 123
//Output: 321
//Input: x = -123
//Output: -321
//Time complexity Ologn and Space complexity O1
class Solution {
    public int reverse(int x) {
        int reverse = 0, prev;
        // x = 123
        while (x != 0) {
            prev = x % 10; // 3 -> 2 - > 1
            x /= 10; // 12 -> 1 - > 0
            if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && prev > 7) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && prev < -8) return 0;
            reverse = reverse * 10 + prev; // 0.3 * 10 -> 3.2 -> 32.1 -> 321
        }
        return reverse;
    }
}
