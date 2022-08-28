package leetcode.backtracking._52;

class Solution {
    int distinct = 0;

    boolean isQueenPlaceable(int row, int column, int[] board) {
        for (int filledRow = 0; filledRow < row; filledRow++) {
            int filledColumn = board[filledRow];
            if (filledColumn == column) return false;
            int distanceRow = Math.abs(row - filledRow);
            int distanceColumn = Math.abs(column - filledColumn);
            if (distanceRow == distanceColumn) return false;
        }

        return true;
    }

    void findQueenPlaceable(int row, int[] board) {
        if (board.length == row) {
            distinct++;
            return;
        }
        for (int column = 0; column < board.length; column++) {
            if (isQueenPlaceable(row, column, board)) {
                board[row] = column;
                findQueenPlaceable(row + 1, board);
            }
        }
    }

    public int totalNQueens(int n) {
        var board = new int[n];
        findQueenPlaceable(0, board);
        return distinct;
    }
}
