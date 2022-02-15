package leetcode.graph.NumberofConnectedComponentsinanUndirectedGraph_323;

import java.util.*;

class Solution {
    private void bfs(Map<Integer, List<Integer>> graph, Set<Integer> seen, int start, int end) {
        if (seen.contains(start)) return;
        seen.add(start);
        var neighbors = graph.get(start);
        for (var i : neighbors) {
            bfs(graph, seen, i, end);
        }

    }

    public int countComponents(int n, int[][] edges) {
        var graph = new HashMap<Integer, List<Integer>>();
        var seen = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!seen.contains(i)) {
                bfs(graph, seen, i, n);
                ans++;
            }

        }
        return ans;
    }
}

// Tc O(E+V) E - edges.length V - n
// Sc O(E+V)
