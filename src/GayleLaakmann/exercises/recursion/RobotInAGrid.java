package GayleLaakmann.exercises.recursion;

public class RobotInAGrid {

    boolean move(int r, int c, int[][] grid, int[][] memo) {
        if (r >= grid.length || r < 0) return false;
        if (c >= grid[r].length || c < 0) return false;
        if (memo[r][c] == 1) return true;
        if (memo[r][c] == -1) return false;
        int gridValue = grid[r][c];
        if (gridValue == 1) return true;
        if (gridValue == -1) return false;
        boolean right = move(r + 1, c, grid, memo);
        boolean down = move(r, c + 1, grid, memo);
        if (right || down) memo[r][c] = 1;
        else memo[r][c] = -1;
        return (right || down);
    }

}
