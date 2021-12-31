package leetcode.dfs.IslandPerimeter_463;
import java.util.*;

class Solution {
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int row = 0; row < grid.length; ++row) {
            for (int col = 0; col < grid[row].length; ++col) {
                if (grid[row][col] == 1) return dfs(grid, visited, row, col);
            }
        }

        return 0;
    }
    int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        if (row >= grid.length ||
                col >= grid[0].length ||
                row < 0 ||
                col < 0 ||
                grid[row][col] == 0) return 1;
        if (visited[row][col] == true) return 0;
        visited[row][col] = true;

        int ans = 0;
        ans += dfs(grid, visited, row, col+1);
        ans += dfs(grid, visited, row+1, col);
        ans += dfs(grid, visited, row, col-1);
        ans += dfs(grid, visited, row-1, col);
        return ans;
    }
}
