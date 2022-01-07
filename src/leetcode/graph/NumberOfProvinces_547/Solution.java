package leetcode.graph.NumberOfProvinces_547;

import java.util.*;

class Solution {
    private void dfs(int[][] n, int i, boolean[] visited) {
        for (int j = 0; j < n[i].length; ++j) {
            if (visited[j] == false && n[i][j] == 1) {
                visited[j] = true;
                dfs(n, j, visited);
            }
        }
    }

    public int findCircleNum(int[][] n) {
        int ans = 0;
        var visited = new boolean[n.length];

        for (int i = 0; i < n.length; ++i) {
            if (visited[i] == false) {
                ans++;
                dfs(n, i, visited);
            }
        }
        return ans;
    }
}
