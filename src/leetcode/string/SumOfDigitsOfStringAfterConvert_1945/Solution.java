package leetcode.string.SumOfDigitsOfStringAfterConvert_1945;

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder b = new StringBuilder();
        int res = 0;

        for (char c: s.toCharArray()) {
            b.append(c - 'a' + 1);
        }

        for (int i = 0; i < k; i++) {
            for (char l: b.toString().toCharArray()) {
                res += l - '0';
            }

            if (k > 1 && i != k - 1) {
                b.setLength(0);
                b.append(res);
                res = 0;
            }
        }

        return res;
    }
}
