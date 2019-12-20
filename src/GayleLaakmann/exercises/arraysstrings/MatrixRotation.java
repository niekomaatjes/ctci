package GayleLaakmann.exercises.arraysstrings;



/**
 * 1.7
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class MatrixRotation {

    public void rotate(int[][] matrix) {
        int n = matrix.length / 2;
        for (int first = 0; first < n; first++) {
            int last = matrix.length - 1 - first;
            for (int i = 0; i + first < last; i++) {
                int temp = matrix[first][first + i];
                matrix[first][first + i] = matrix[last - i][first];
                matrix[last - i][first] = matrix[last][last - i];
                matrix[last][last - i] = matrix[first + i][last];
                matrix[first + i][last] = temp;
            }
        }
    }


}
