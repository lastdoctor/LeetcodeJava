package com.company.array.SelfDividingNumbers_728;

import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            StringBuilder sb = new StringBuilder();
            sb.append(num);

            boolean isSelf = true;
            for (char c : sb.toString().toCharArray()) {
                if (c == '0' || num % (c -'0') > 0) {
                    isSelf = false;
                    break;
                }
            }

            if (isSelf) ans.add(num);
        }

        return ans;
    }
}
