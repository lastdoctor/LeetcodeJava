package leetcode.memoization._62;

class Solution {
    int dfs(int row, int col, int[][] cache) {
        if (row < 0 || col < 0) return 0;
        else if (row == 0 || col == 0) return 1;
        else if (cache[row][col] > 0) return cache[row][col];
        cache[row][col] = dfs(row - 1, col, cache) + dfs(row, col - 1, cache);
        return cache[row][col];
    }

    public int uniquePaths(int m, int n) {
        int row = m - 1;
        int col = n - 1;
        var cache = new int[m][n];
        return dfs(row, col, cache);
    }
}
