package leetcode.dfs.IslandPerimeter_463;
import java.util.*;

class Solution {
    Set<String> visited = new HashSet<>();
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) return dfs(grid, i, j);
            }
        }
        return 0;
    }

    int dfs(int[][]grid, int i, int j) {
        if (i >= grid.length ||
                j >= grid[0].length ||
                i < 0 ||
                j < 0 ||
                grid[i][j] == 0) return 1;
        if (visited.contains(""+i+j)) return 0;
        visited.add(""+i+j);
        int perim = 0;
        perim += dfs(grid, i, j+1);
        perim += dfs(grid, i+1, j);
        perim += dfs(grid, i, j-1);
        perim += dfs(grid, i-1, j);
        return perim;
    }
}
