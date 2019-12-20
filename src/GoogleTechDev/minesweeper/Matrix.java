package GoogleTechDev.minesweeper;

import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {

    private int rows, columns;
    private List<List<T>> matrix;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new ArrayList<>();
        init();
    }

    private void init() {
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<T>());
        }
    }
    public void set(int row, int column, T element) {
        matrix.get(row).add(column,element);
    }

    public T get(int row, int column) {
        return matrix.get(row).get(column);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
