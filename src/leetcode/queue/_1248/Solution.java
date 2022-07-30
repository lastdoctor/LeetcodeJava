package leetcode.queue._1248;

import java.util.LinkedList;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
    }

    boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        var q = new LinkedList<Integer>();
        q.addLast(-1);

        int countSubs = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (isOdd(num)) q.addLast(i);
            if (q.size() > k + 1) q.removeFirst();
            if (q.size() == k + 1) {
                if (q.size() > 1) countSubs += (q.size() > 1 ? q.get(1) : i) - q.get(0);
            }
        }

        return countSubs;
    }
}
