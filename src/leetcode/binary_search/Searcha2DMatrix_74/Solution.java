package leetcode.binary_search.Searcha2DMatrix_74;

class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int row = 0;
        int col = m[0].length-1;
        while (row < m.length && col >= 0) {
            if (m[row][col] == t) return true;
            else if (m[row][col] > t) col--;
            else row++;
        }
        return false;
    }
}
