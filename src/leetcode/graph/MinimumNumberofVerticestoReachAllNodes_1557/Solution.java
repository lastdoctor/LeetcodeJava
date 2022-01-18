package leetcode.graph.MinimumNumberofVerticestoReachAllNodes_1557;

import java.util.*;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        var ans = new ArrayList<Integer>();
        var visited = new int[n];
        for (var edge : edges) {
            int to = edge.get(1);
            if (visited[to] == 0) visited[to] = 1;
        }

        for (int i = 0; i < visited.length; ++i) if (visited[i] == 0) ans.add(i);
        return ans;
    }
}

class Solution1 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        var ans = new ArrayList<Integer>();
        var visited = new boolean[n];
        for (var edge : edges) {
            int to = edge.get(1);
            if (visited[to] == false) visited[to] = true;
        }
        for (int i = 0; i < visited.length; ++i)  if (visited[i] == false) ans.add(i);

        return ans;
    }
}
