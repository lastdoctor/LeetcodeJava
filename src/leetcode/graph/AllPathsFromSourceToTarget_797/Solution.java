package leetcode.graph.AllPathsFromSourceToTarget_797;

import java.util.*;

class Solution {
    private int target;
    private int[][] graph;
    private List<List<Integer>> ans;

    void backtrack(int currNode, LinkedList<Integer> path) {
        if (currNode == target) {
            ans.add(new ArrayList<Integer>(path));
            return;
        }

        for (int nextNode : graph[currNode]) {
            path.addLast(nextNode);
            backtrack(nextNode, path);
            path.removeLast();
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        target = graph.length - 1;
        ans = new ArrayList<List<Integer>>();
        var path = new LinkedList<Integer>();
        path.addLast(0);
        backtrack(0, path);
        return this.ans;
    }
}
