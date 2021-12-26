package leetcode.graph;

class Solution {
    public int findCenter(int[][] edges) {
        int ans = 0;

        int f = edges[0][0];
        int s = edges[0][1];

        if (edges[1][0] == f) ans = edges[1][0];
        if (edges[1][0] == s) ans = edges[1][0];
        if (edges[1][1] == s) ans = edges[1][1];
        if (edges[1][1] == f) ans = edges[1][1];
        return ans;
    }
}