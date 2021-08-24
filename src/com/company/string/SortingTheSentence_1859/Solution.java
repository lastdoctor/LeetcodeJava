package com.company.string.SortingTheSentence_1859;

import java.util.Arrays;

class Solution {
    public String sortSentence(String s) {
        String[] ans = s.split(" ");

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(IsNum(s.charAt(i))) {
                ans[Integer.parseInt(String.valueOf(s.charAt(i))) - 1] = temp;
                temp = "";
                i++;
            } else {
                temp += s.charAt(i);
            }
        }

        return String.join(" ", ans);
    }

    private boolean IsNum(char c) {
        return c - '0' >= 0 && c - '9' <= 0;
    }
}

