package leetcode.backtracking._51;

import java.util.*;

class Solution {
    Set<Integer> columns = new HashSet<>();
    Set<Integer> positiveDiagonal = new HashSet<>(); // row - col
    Set<Integer> negativeDiagonal = new HashSet<>(); // row + col

    void findNQueens(int expectedSize, int rowIndex, List<String> candidate, List<List<String>> nQueens) {
        if (expectedSize == candidate.size()) {
            nQueens.add(new ArrayList<>(candidate));
            return;
        }

        for (int columnIndex = 0; columnIndex < expectedSize; columnIndex++) {
            if (
                    columns.contains(columnIndex) ||
                            positiveDiagonal.contains(rowIndex - columnIndex) ||
                            negativeDiagonal.contains(rowIndex + columnIndex)
            ) continue;

            var rowChar = new char[expectedSize];
            Arrays.fill(rowChar, '.');
            rowChar[columnIndex] = 'Q'; // the most important line of code
            var row = String.valueOf(rowChar);

            candidate.add(row);
            columns.add(columnIndex);
            positiveDiagonal.add(rowIndex - columnIndex);
            negativeDiagonal.add(rowIndex + columnIndex);

            findNQueens(expectedSize, rowIndex + 1, candidate, nQueens);

            candidate.remove(candidate.size() - 1);
            columns.remove(columnIndex);
            positiveDiagonal.remove(rowIndex - columnIndex);
            negativeDiagonal.remove(rowIndex + columnIndex);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        var nQueens = new ArrayList<List<String>>();
        var nQueen = new ArrayList<String>();

        findNQueens(n, 0, nQueen, nQueens);

        return nQueens;
    }
}
