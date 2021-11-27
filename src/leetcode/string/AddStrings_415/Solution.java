package leetcode.string.AddStrings_415;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;

        while(p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int value = (carry + x1 + x2) % 10;
            carry = (x1 + x2 + carry) / 10;
            ans.append(value);
            p1--;
            p2--;
        }
        if (carry != 0) ans.append(carry);

        return ans.reverse().toString();
    }
}
