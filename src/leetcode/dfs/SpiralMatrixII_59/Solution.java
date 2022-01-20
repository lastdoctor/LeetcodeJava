package leetcode.dfs.SpiralMatrixII_59;

class Solution {
    public int[][] generateMatrix(int n) {
        var m = new int[n][n];
        dfs(m, 0, 0, false, 1);
        return m;
    }
    private void dfs(int[][] m, int row, int col, boolean goup,int inc) {
        if (row < 0 || col < 0 || col >= m[0].length || row >= m.length || m[row][col] != 0) return;
        m[row][col] = inc;
        if (goup) dfs(m, row-1, col, true, inc +1);
        dfs(m, row, col+1, false, inc +1);
        dfs(m, row + 1, col, false, inc +1);
        dfs(m, row, col-1, false, inc +1);
        dfs(m, row-1, col, true, inc +1);
    }
}
