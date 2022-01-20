package leetcode.dfs.SpiralMatrix_54;

import java.util.*;

class Solution {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] arr) {
        dfs(arr, 0, 0, false);
        return ans;
    }

    private void dfs(int[][] arr, int row, int col, boolean goup) {
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[row].length || arr[row][col] == 101) return;
        ans.add(arr[row][col]);
        arr[row][col] = 101;

        if (goup) dfs(arr, row - 1, col, true);

        dfs(arr, row, col + 1, false);
        dfs(arr, row + 1, col, false);
        dfs(arr, row, col - 1, false);
        dfs(arr, row - 1, col, true);
    }
}
