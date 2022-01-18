package leetcode.dfs.NumberofEnclaves_1020;

class Solution {
    public int numEnclaves(int[][] grid) {
        int ans = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (row == 0 || col == 0 || row == grid.length - 1 || col == grid[row].length - 1) dfs(grid, row, col);
            }
        }
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) ans++;
            }
        }
        return ans;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (row >= 0 && col >= 0 && row <= grid.length - 1 && col <= grid[row].length - 1 && grid[row][col] == 1) {
            grid[row][col] = 0;
            dfs(grid, row, col + 1);
            dfs(grid, row + 1, col);
            dfs(grid, row, col - 1);
            dfs(grid, row - 1, col);
        }
    }

    public static void main(String... args) {
        var grid = new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        var s = new Solution().numEnclaves(grid);
        System.out.println(s);
    }
}
