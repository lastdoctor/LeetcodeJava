package leetcode.dynamic_programming._120;

import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // [[2],[3,4],[6,5,7],[4,1,8,3]]
        int n = triangle.size();
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int minCandidate1 = triangle.get(row + 1).get(col);
                int minCandidate2 = triangle.get(row + 1).get(col + 1);
                int currMin = Math.min(minCandidate1, minCandidate2);
                triangle.get(row).set(col, triangle.get(row).get(col) + currMin);
            }
        }

        return triangle.get(0).get(0);
    }
}
