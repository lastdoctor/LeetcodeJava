package leetcode.graph.NumberOfProvinces_547;

import java.util.*;

// dfs
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

// bfs
class Solution1 {
    private void bfs(int[][] n, boolean[] visited, int i) {
        var q = new LinkedList<Integer>();
        q.addLast(i);
        while(!q.isEmpty()){
            int node = q.removeFirst();
            for (int j = 0; j < n.length; ++j) {
                if (n[node][j] == 1 && visited[j] == false) {
                    visited[j] = true;
                    q.addLast(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] n) {
        int ans = 0;
        var visited = new boolean[n.length];
        for (int i = 0; i < n.length; i++) {
            if (visited[i] == false) {
                ++ans;
                bfs(n, visited, i);
            }
        }
        return ans;
    }
}