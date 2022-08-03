package leetcode.array._378;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        var oneDimension = new int[n * n];
        int index = 0;
        for (var row : matrix) {
            for (var cell : row) {
                oneDimension[index] = cell;
                index++;
            }
        }
        Arrays.sort(oneDimension);

        return oneDimension[k - 1];
    }
}

class Solution1 {
    public static void main(String[] args) {
        var s = new Solution1();
        System.out.println(s.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    }

    public int kthSmallest(int[][] matrix, int k) {
        var pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (var row : matrix) {
            for (int cell : row) {
                if (pq.size() < k) {
                    System.out.println("pq.size() = " + pq.size());
                    System.out.println("cell = " + cell);
                    pq.add(cell);
                } else if (cell < pq.peek()) {
                    System.out.println("pq.poll() = " + pq.peek());
                    System.out.println("cell = " + cell);
                    pq.poll();
                    pq.add(cell);
                }
            }
        }

        return pq.peek();
    }
}
