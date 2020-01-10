package GayleLaakmann.exercises.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        solve(n, 0, new Integer[n], results);
        return results;
    }

    public void solve(int n, int row, Integer[] columns, List<List<String>> results) {
        if (n == row) {
            List<String> solution = new ArrayList<>();
            Integer[] columnsCopy = columns.clone();
            for (int i = 0; i < n; i++) {
                String stringRow = "";
                for (int j = 0; j < n; j++) {
                    stringRow += columnsCopy[i] == j ? "Q" : ".";
                }
                solution.add(stringRow);
            }
            results.add(solution);
        } else {
            for (int i = 0; i < n; i++) {
                if (validColumn(row, i, columns)) {
                    columns[row] = i;
                    solve(n, row + 1, columns, results);
                }
            }
        }
    }

    private boolean validColumn(int row, int column, Integer[] columns) {
        for (int i = 0; i < row; i++) {
            int column2 = columns[i];
            if (column2 == column) return false;
            int columnDistance = Math.abs(column2 - column);
            int rowDistance = row - i;
            if (columnDistance == rowDistance) return false;
        }
        return true;
    }
}
