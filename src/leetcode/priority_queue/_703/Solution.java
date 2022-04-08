package leetcode.priority_queue._703;

import java.util.*;

class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        for (int num : nums) {
            pq.add(num);
        }
        this.k = k;
    }

    public int add(int val) {
        pq.add(val);

        while (pq.size() > k) {
            pq.remove();
        }

        return pq.peek();
    }
}
