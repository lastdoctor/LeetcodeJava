package leetcode.array._378;

import java.util.Arrays;

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
