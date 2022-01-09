package leetcode.stack.BasicCalculatorII_227;

import java.util.LinkedList;

class Solution {
    private boolean isNumber(char c) {
        return '0' <= c && '9' >= c;
    }

    public int calculate(String s) {
        var st = new LinkedList<Integer>();
        char sign = '+';
        int num = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (isNumber(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '+' || c == '-' || c == '/' || c == '*') {
                if (sign == '-') st.addLast(-num);
                if (sign == '+') st.addLast(num);
                if (sign == '*') {
                    int n = st.removeLast();
                    st.addLast(n * num);
                }
                if (sign == '/') {
                    int n = st.removeLast();
                    st.addLast(n / num);
                }
                sign = c;
                num = 0;
            }
        }

        for (int n : st) {
            ans += n;
        }
        return ans;
    }
}

