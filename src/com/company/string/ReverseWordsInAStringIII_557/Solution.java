package com.company.string.ReverseWordsInAStringIII_557;

class Solution {
    public String reverseWords(String s) {
        s += ' ';
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                temp.append(c);
            } else {
                temp.reverse();
                temp.append(c);
                ans.append(temp);
                temp.delete(0, temp.length());
            }

        }
        ans.delete(ans.length() - 1, ans.length());
        return ans.toString();
    }
}


class Solution1 {
    public String reverseWords(String input) {
        final StringBuilder result = new StringBuilder();
        final StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
}
