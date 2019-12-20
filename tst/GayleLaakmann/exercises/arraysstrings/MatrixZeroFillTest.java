package GayleLaakmann.exercises.arraysstrings;

import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.print2DArray;

class MatrixZeroFillTest {

    @Test
    void setZeroes_5x5() {
        MatrixZeroFill matrixZeroFill = new MatrixZeroFill();
        int[][] m = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 0, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 0}
        };
        print2DArray(m);
        matrixZeroFill.setZeroes(m);
        System.out.println("*******");
        print2DArray(m);
    }

    @Test
    void setZeroes_3x3() {
        MatrixZeroFill matrixZeroFill = new MatrixZeroFill();
        int[][] m = new int[][]{
                {1, 2, 3},
                {6, 7, 0},
                {21, 22, 23}
        };
        print2DArray(m);
        matrixZeroFill.setZeroes(m);
        System.out.println("*******");
        print2DArray(m);
    }
    @Test
    void setZeroes_3x3_2() {
        MatrixZeroFill matrixZeroFill = new MatrixZeroFill();
        int[][] m = new int[][]{
                {1, 2, 3},
                {6, 0, 3},
                {21, 22, 23}
        };
        print2DArray(m);
        matrixZeroFill.setZeroes(m);
        System.out.println("*******");
        print2DArray(m);
    }
}