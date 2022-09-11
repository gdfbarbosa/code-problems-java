package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/flood-fill/">733. Flood Fill</a>
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length, n = image[0].length;
        dfs(sr, sc, image, m, n, color, image[sr][sc]);
        return image;
    }

    public void dfs(int i, int j, int[][] image, int m, int n, int color, int originalColor) {
        if (i < 0 || j < 0 || i >= m || j >= n || image[i][j] != originalColor || image[i][j] == color) return;
        image[i][j] = color;
        dfs(i, j-1, image, m, n, color, originalColor);
        dfs(i, j+1, image, m, n, color, originalColor);
        dfs(i-1, j, image, m, n, color, originalColor);
        dfs(i+1, j, image, m, n, color, originalColor);
    }
}
