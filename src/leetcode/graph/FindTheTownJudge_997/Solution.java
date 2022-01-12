package leetcode.graph.FindTheTownJudge_997;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n + 1];
        for (int[] person : trust) {
            trusted[person[0]]--;
            trusted[person[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trusted[i] == n - 1) return i;
        }
        return -1;
    }
}
