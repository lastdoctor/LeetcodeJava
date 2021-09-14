package com.company.string.ReplaceAllDigitsWithCharacters_1844;

class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int cint = Character.getNumericValue(s.charAt(i));
                ans.append((char)(s.charAt(i - 1) + cint));
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString().trim();
    }
}

class Solution1 {
    public String replaceDigits(String s) {
        char[] ans = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                ans[i] = shift(ans[i - 1], ans[i]);
            }
        }
        return String.valueOf(ans);
    }

    char shift(char letter, char number) {
        int a = Integer.parseInt(String.valueOf(number));
        int asci = (int)letter;
        char c = (char)(asci + a);
        return c;
    }
}