package GayleLaakmann.exercises.arraysstrings;

import org.junit.jupiter.api.Test;

import static GayleLaakmann.Utils.print2DArray;

class MatrixRotationTest {

    @Test
    void rotate_3x3() {
        MatrixRotation matrixRotation = new MatrixRotation();
        int[][] m = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print2DArray(m);
        matrixRotation.rotate(m);
        System.out.println("*******");
        print2DArray(m);
    }

    @Test
    void rotate_4x4() {
        MatrixRotation matrixRotation = new MatrixRotation();
        int[][] m = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        print2DArray(m);
        matrixRotation.rotate(m);
        System.out.println("*******");
        print2DArray(m);
    }

    @Test
    void rotate_5x5() {
        MatrixRotation matrixRotation = new MatrixRotation();
        int[][] m = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        print2DArray(m);
        matrixRotation.rotate(m);
        System.out.println("*******");
        print2DArray(m);
    }

}