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


class Solution1 {
    public int lastStoneWeight(int[] stones) {
        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        int x;
        int y;

        while (maxHeap.size() > 1) {
            y = maxHeap.poll();
            x = maxHeap.poll();

            if (y > x) {
                maxHeap.offer(y - x);
            }
        }

        if (maxHeap.size() == 0) return 0;
        return maxHeap.poll();
    }
}


// x <= y
// x == y
// x != y x is destroyed y, has new weight y - x.

// x <= y
// x == y
// x != y x is destroyed y, has new weight y - x.
