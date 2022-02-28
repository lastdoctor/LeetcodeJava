package leetcode.array._228;

import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        var ans = new ArrayList<String>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ans.add(start + "->" + nums[i]);
            } else {
                ans.add(start + "");
            }
        }

        return ans;
    }
}
