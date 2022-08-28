package leetcode.backtracking._51;

import java.util.*;

class Solution {
    Set<Integer> columns = new HashSet<>();
    Set<Integer> postiveDiagonal = new HashSet<>();
    Set<Integer> negativeDiagonal = new HashSet<>();

    void getQueens(int expectedRowAndColumnSize, int rowIndex, List<String> candidateQueen, List<List<String>> queens) {
        if (expectedRowAndColumnSize == candidateQueen.size()) {
            queens.add(new ArrayList<>(candidateQueen));
            return;
        }
        for (int columnIndex = 0; columnIndex < expectedRowAndColumnSize; columnIndex++) {
            if (columns.contains(columnIndex) || postiveDiagonal.contains(rowIndex + columnIndex) || negativeDiagonal.contains(rowIndex - columnIndex))
                continue;

            var rowChars = new char[expectedRowAndColumnSize];
            Arrays.fill(rowChars, '.');
            rowChars[columnIndex] = 'Q';
            var candidate = String.valueOf(rowChars);
            candidateQueen.add(candidate);

            columns.add(columnIndex);
            postiveDiagonal.add(rowIndex + columnIndex);
            negativeDiagonal.add(rowIndex - columnIndex);

            getQueens(expectedRowAndColumnSize, rowIndex + 1, candidateQueen, queens);

            candidateQueen.remove(candidateQueen.size() - 1);
            columns.remove(columnIndex);
            postiveDiagonal.remove(rowIndex + columnIndex);
            negativeDiagonal.remove(rowIndex - columnIndex);

        }
    }

    public List<List<String>> solveNQueens(int n) {
        var queens = new ArrayList<List<String>>();
        var candidateQueen = new ArrayList<String>();
        getQueens(n, 0, candidateQueen, queens);

        return queens;
    }
}
