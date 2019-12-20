package GayleLaakmann.exercises.arraysstrings;

import java.util.ArrayList;
import java.util.List;
/**
 * 1.8
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */
public class MatrixZeroFill {

    public void setZeroes(int[][] m) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                int value = m[r][c];
                if (value == 0) {
                    rows.add(r);
                    columns.add(c);
                }
            }
        }
        for (Integer r : rows) {
            for (int i = 0; i < m[0].length; i++) {
                m[r][i] = 0;
            }
        }
        for (Integer c : columns) {
            for (int i = 0; i < m.length; i++) {
                m[i][c] = 0;
            }
        }
    }

}
