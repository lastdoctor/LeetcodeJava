package leetcode.math.Base7_504;

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder ans = new StringBuilder();
        int sign = num;
        num = Math.abs(num);
        while (num != 0) {
            int remainder = num % 7;
            num /= 7;
            ans.append(remainder);
        }

        return sign > 0 ? ans.reverse().toString() : ans.append("-").reverse().toString();
    }
}
