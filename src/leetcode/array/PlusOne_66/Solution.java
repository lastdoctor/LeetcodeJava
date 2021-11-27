package leetcode.array.PlusOne_66;

import java.util.Arrays;

// Time On Space On
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; 0 <= i; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}