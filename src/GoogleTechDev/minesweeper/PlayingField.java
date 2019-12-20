package GoogleTechDev.minesweeper;

public class PlayingField {

    private Matrix<FieldBlock> matrix;
    private int rows, colums;
    private int mines = 0;

    public PlayingField(int rows, int columns, int mines) {
        matrix = new Matrix<>(rows, columns);
        this.rows = rows;
        this.colums = columns;
        this.mines = mines;
        reset();
    }

    public void reset() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                matrix.set(i, j, new FieldBlock(0));
            }
        }
    }

    public void addMine(int r, int c) throws IllegalStateException {
        if (mines == 0) throw new IllegalStateException("Cannot add any more mines to the field !");
        if (matrix.get(r, c).getValue() == 9) throw new IllegalArgumentException("Mine already exists in cell !");
        matrix.set(r, c, new FieldBlock(9));
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                incrementFieldValue(i, j);
            }
        }
        mines--;
    }

    private void incrementFieldValue(int r, int c) {
        if (r >= 0 && r < rows && c >= 0 && c < colums) {
            final FieldBlock fieldBlock = matrix.get(r, c);
            if (fieldBlock.getValue() < 8) fieldBlock.setValue(fieldBlock.getValue() + 1);
        }
    }

    public void expose(int r, int c) {
        if (mines != 0) throw new IllegalStateException("Field is not ready yet !");
        if (r < 0 || r >= colums || c < 0 || c >= colums) return;
        final FieldBlock fieldBlock = matrix.get(r, c);
        if (fieldBlock.isExposed()) return;
        fieldBlock.setExposed(true);
        if (fieldBlock.getValue() == 0) {
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    expose(i, j);
                }
            }
        }
    }

    public void print() {
        System.out.println("*********");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(matrix.get(i, j));
            }
            System.out.println();
        }
        System.out.println("*********");
    }

}
