package nieko;

import java.util.HashMap;

public class SumMatrixZero {

    /**
     * This one is tricky :(
     * It reminds me of the one in which you have to find the number of sub matrices that sum to a target.
     * I'm going to ignore the O(N^6) solution.
     * The tricky part is creating the window of submatrices that sum to 0. And I assume I have to create the
     * submatrices starting from the largest one downwards, so if the condition is met, than I return the current size of the
     * submatrix.
     * I'm going to create the submatrices column by column top-down. I'm going to keep a loop that represents the
     * "offset" for the submatrices window. After that, for each column that goes from the current column offset to the number of columns,
     * I'm going to create my sums row by row. For each window, create a vector of size rows where in each position r I have the sum of elements
     * in position matrix[r][i], I don't reset the vector, so when we increment the column iterator i, sums[r] will be updated with the value in matrix[r][i]
     * example
     *  1 2
     *  3 4
     *  col = 0      col = 1
     *  sums[0] = 1  sums[0] = 3
     *  Effectively creating a sum of all rectangular submatrices starting from 1 to cols, for each row.
     *  After that, we have to use the hash map algorithm for finding a sum inside of a running sum. Only in this case,
     *  I want to keep track of the rows where I found that particular sum, because the difference between the row in which I am
     *  now, and the row where I have seen that sum before, is going to determinate the value of the row length of the sub matrix.
     *  example
     *   9, 7, 16, 5
     *   1, -6, -7, 3
     *   1, 8, 7, 9
     *   7, -2, 0, 10
     *
     *   In this we have a submatrix that sums zero that has row indices between 1 and 3 and rows between 1 and 2.
     *   So we need to keep track of where we start the sum that is going to lead us to zero.
     *   Example for this matrix, the sums of size 2 vector windows between column 1 and 2 for each row is :
     *   23, -13, 15, -2, so our HashMap will be
     *   {(0,0), (23,1), (10,2), (25,3), (23,4)}
     *   So we start with a running sum that is equal to 0 in the first position, because we haven't added anything yet.
     *   If we encounter runningSum = 0 during the iteration, let's say in row 3, then rowLength = 3 - 0 = 3,
     *   do we then update the map ? No, because we want our window to be as large as possible. We're looking for the largest
     *   submatrix. In the end, we have values 23 iteration 1 and 4, this means the values of the sums after the first time
     *   we encountered 23, until the 2nd time we encountered it, is going to be 0, why ? Let's break it down -->
     *   The sum at state 1 is 23, we add some more numbers to it until the value at state i, is still 23, what does this mean ?
     *   That those numbers, between 1 and i, ARE WORTHLESS, joking, tired, wrote a lot of code today, forgive me, anyway, the values of
     *   the numbers between 1 and i add up to 0, because in the end the value of the sum at state i is still 23, so everything I added after
     *   state 1, must be worth 0.
     *
     *   If after the iteration I find a value of rowLength and colLength, it means that I have found my submatrix,
     *   and also the largest one, because we are iterating on the largest submatrices first.
     *
     */
    int largestSubMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < cols; i++) {
            int[] sums = new int[rows];
            int rowLength = -1;
            int colLength = -1;
            for (int j = i; j < cols; j++) {
                for (int r = 0; r < rows; r++) {
                    sums[r] += matrix[r][j];
                }
                HashMap<Integer, Integer> sumMap = new HashMap<>();
                int sum = 0;
                sumMap.put(0, 0);
                for (int r = 0; r < rows; r++) {
                    int key = r + 1;
                    sum += sums[r];
                    int occurrenceOfSum = sumMap.getOrDefault(sum, -1);
                    if (occurrenceOfSum >= 0) {
                        rowLength = key - occurrenceOfSum;
                        colLength = j + 1 - i;
                    } else sumMap.put(sum, key);
                }
            }
            if (rowLength >= 0) return rowLength * colLength;
        }
        return 0;
    }

}
