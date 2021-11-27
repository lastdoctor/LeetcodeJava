package leetcode.stack.BuildAnArrayWithStackOperations_1441;

import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();

        for (int i = 1, idx = 0; idx < target.length; i++) {
            ans.add("Push");
            if (target[idx] != i) {
                ans.add("Pop");
            } else {
                idx++;
            }
        }

        return ans;
    }
}
