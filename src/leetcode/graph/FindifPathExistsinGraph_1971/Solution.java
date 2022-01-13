package leetcode.graph.FindifPathExistsinGraph_1971;

import java.util.*;

class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) return true;

        var graph = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) graph.put(i, new ArrayList());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        var visited = new boolean[n];
        dfs(graph, visited, start, end);

        return found;
    }
    void dfs (Map<Integer, List<Integer>> graph, boolean[] visited, int start, int end) {
        if (visited[start] == true || found) return;
        visited[start] = true;
        for (int nei : graph.get(start)) {
            if (nei == end) {
                found = true;
                break;
            }
            if (visited[nei] == false) dfs(graph, visited, nei, end);
        }
    }
}