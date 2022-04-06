package leetcode.dfs._695;

class Solution {
    private int count = 0;

    private void dfs(int[][] grid, int row, int col) {
        if (row >= grid.length ||
                col >= grid[0].length ||
                row < 0 ||
                col < 0 ||
                grid[row][col] == 0
        ) return;

        grid[row][col] = 0;

        count++;
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }

    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) return 0;

        int max = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    count = 0;
                    dfs(grid, row, col);
                    max = Math.max(max, count);
                }
            }
        }

        return max;
    }
}
