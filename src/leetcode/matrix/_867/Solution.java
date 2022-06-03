package leetcode.matrix._867;

class Solution {
    public int[][] transpose(int[][] matrix) {
        // [[1,2,3],[4,5,6]]
        // [[1,4], [2,5], [3,6]]

        int m = matrix.length;
        int n = matrix[0].length;
        var tmatrix = new int[n][m];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                tmatrix[col][row] = matrix[row][col];
            }
        }


        return tmatrix;
    }
}
