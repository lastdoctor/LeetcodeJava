package leetcode.math.SequentialDigits_1291;

import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        var digits = "123456789";
        var ans = new ArrayList<Integer>();
        int nl = ("" + low).length();
        int nh = ("" + high).length();
        for (int i = nl; i <= nh; i++) {
            for (int j = 0; j < 10 - i; j++) {
                int num = Integer.parseInt(digits.substring(j, j + i));
                if (num >= low && num <= high) ans.add(num);
            }
        }
        return ans;
    }
}
