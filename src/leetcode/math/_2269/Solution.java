package leetcode.math._2269;

class Solution {
    public int divisorSubstrings(int num, int k) {
        int beautyNum = 0;
        int pow = (int) Math.pow(10, k);

        for (int n = num; n > 0;  n /= 10) {
            int divided = n % pow;

            if (divided != 0 && num % divided == 0)  beautyNum++;

            if (n / pow == 0) break;
        }

        return beautyNum;
    }
}
