package leetcode.priority_queue._1046;

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);

        for (int i = stones.length - 1; i > 0; i--) {
            stones[i - 1] = stones[i] - stones[i - 1];
            Arrays.sort(stones);
        }

        return stones[0];
    }
}


// x <= y
// x == y
// x != y x is destroyed y, has new weight y - x.
