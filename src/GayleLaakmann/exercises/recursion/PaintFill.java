package GayleLaakmann.exercises.recursion;

public class PaintFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor == image[sr][sc]) return image;
        fill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int newColor, int pixel) {
        if (sr < 0 || sr >= image.length) return;
        if (sc < 0 || sc >= image[sr].length) return;
        if (image[sr][sc] != pixel) return;
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, newColor, pixel);
        fill(image, sr - 1, sc, newColor, pixel);
        fill(image, sr, sc + 1, newColor, pixel);
        fill(image, sr, sc - 1, newColor, pixel);
    }
}
