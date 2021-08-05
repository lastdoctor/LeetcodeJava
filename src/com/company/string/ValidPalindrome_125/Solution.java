package com.company.string.ValidPalindrome_125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String reverse = "";
        int right = s.length()-1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == ' '
                    || s.charAt(i) == ':'
                    || s.charAt(i) == ','
                    || s.charAt(i) == '.') {
                s.substring(i, s.length()-1);
            }
            if(s.charAt(right) == ' '
                    || s.charAt(right) == ':'
                    || s.charAt(right) == ','
                    || s.charAt(right) == '.') {
                right--;
            } else {
                reverse+=s.charAt(right);
            }
        }

        return s.equals(reverse);
    }
}