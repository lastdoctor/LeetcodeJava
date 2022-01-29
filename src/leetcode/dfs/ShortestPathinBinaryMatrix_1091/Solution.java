package leetcode.dfs.ShortestPathinBinaryMatrix_1091;

import java.util.*;

class Solution {
    class Pair {
        int x;
        int y;
        int count;

        Pair(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    private int BFS(int grid[][], int start_x, int start_y, int target_x, int target_y) {
        var q = new LinkedList<Pair>();
        q.addLast(new Pair(start_x, start_y, 1));

        while (!q.isEmpty()) {
            var rem = q.removeFirst();
            int x = rem.x;
            int y = rem.y;
            int count = rem.count;

            if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != 1) {
                grid[x][y] = 1;

                if (x == target_x && y == target_y) return count;

                q.addLast(new Pair(x - 1, y, count + 1));
                q.addLast(new Pair(x - 1, y + 1, count + 1));
                q.addLast(new Pair(x, y + 1, count + 1));
                q.addLast(new Pair(x + 1, y + 1, count + 1));
                q.addLast(new Pair(x + 1, y, count + 1));
                q.addLast(new Pair(x + 1, y - 1, count + 1));
                q.addLast(new Pair(x, y - 1, count + 1));
                q.addLast(new Pair(x - 1, y - 1, count + 1));
            }

        }

        return -1;
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        return BFS(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }
}

class Main {
    public static void main(String[] args) {
        var test = new int[][]{{0, 1}, {1, 0}};
        int s = new Solution().shortestPathBinaryMatrix(test);
        System.out.println(s);
    }
}
