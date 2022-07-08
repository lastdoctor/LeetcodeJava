package leetcode.tree_map._128;

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // TS O(NlogN) SC O(logN)
        // [100,4,200,1,3,2]
        // {1 2 3 4 ...0... 100 200}
        //  1 2 3 4 ...n... 100 200
        var sortedMap = new TreeMap<Integer, Integer>();
        for (int num : nums) {
            sortedMap.put(num, num);
        }

        int maxConSeq = 0;
        int currConSeq = 1;
        for (var key : sortedMap.keySet()) {
            if (sortedMap.containsKey(key + 1)) {
                currConSeq++;
            } else {
                maxConSeq = Math.max(maxConSeq, currConSeq);
                currConSeq = 1;
            }
        }

        return maxConSeq;

    }
}
