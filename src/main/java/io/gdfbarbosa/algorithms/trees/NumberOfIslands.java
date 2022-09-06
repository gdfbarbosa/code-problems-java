package io.gdfbarbosa.algorithms.trees;

/**
 * <a href="https://leetcode.com/problems/number-of-islands/">200. Number of Islands</a>
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') { // island
                    dfs(i, j, grid, m, n);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, char[][] grid, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfs(i, j - 1, grid, m, n); // left
        dfs(i, j + 1, grid, m, n); // right
        dfs(i - 1, j, grid, m, n); // top
        dfs(i + 1, j, grid, m, n); // bottom
    }
}
