package leetcode.graph.GraphValidTree_261;

import java.util.*;

class Solution {
    public boolean validTree(int n, int[][] edges) {
        var visited = new HashSet<Integer>();
        var graph = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            graph.add(i, new ArrayList<Integer>());
        }
        for (int row = 0; row < edges.length; ++row) {
            graph.get(edges[row][1]).add(edges[row][0]);
            graph.get(edges[row][0]).add(edges[row][1]);
        }
        helper(graph, 0, visited, -1);
        return visited.size() == n && edges.length == n-1;
    }
    void helper(List<List<Integer>> graph, int node, Set<Integer> visited, int parent) {
        if (visited.contains(node)) return;
        visited.add(node);
        for (int edge : graph.get(node)) {
            helper(graph, edge, visited, node);
        }
    }
}