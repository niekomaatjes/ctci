package GayleLaakmann.exercises.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NQueensTest {

    @Test
    void solveNQueens() {
        NQueens nQueens = new NQueens();
        nQueens.solveNQueens(4);
    }
}