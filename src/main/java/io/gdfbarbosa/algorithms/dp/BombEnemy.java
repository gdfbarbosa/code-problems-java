package io.gdfbarbosa.algorithms.dp;

/**
 * <a href="https://leetcode.com/problems/bomb-enemy/">361. Bomb Enemy</a>
 * Solution credits: <a href="https://leetcode.com/problems/bomb-enemy/solutions/83387/short-o-mn-time-o-n-space-solution/?orderBy=most_votes">Stefan Pochmann</a>
 */
public class BombEnemy {
    public int maxKilledEnemies(char[][] grid) {
        if (grid.length == 0)
            return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        int maxCount = 0;
        int rowHits = 0;
        int[] colHits = new int[cols];

        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                // reset the hits on the row, if necessary.
                rowHits = getRowHits(grid, cols, rowHits, row, col);

                // reset the hits on the column, if necessary.
                getColHits(grid, rows, colHits, row, col);

                // run the calculation for the empty cell.
                if (grid[row][col] == '0') {
                    maxCount = Math.max(maxCount, rowHits + colHits[col]);
                }
            }
        }

        return maxCount;
    }

    private static void getColHits(char[][] grid, int rows, int[] colHits, int row, int col) {
        if (row == 0 || grid[row - 1][col] == 'W') {
            colHits[col] = 0;
            for (int k = row; k < rows; ++k) {
                if (grid[k][col] == 'W')
                    break;
                else if (grid[k][col] == 'E')
                    colHits[col] += 1;
            }
        }
    }

    private static int getRowHits(char[][] grid, int cols, int rowHits, int row, int col) {
        if (col == 0 || grid[row][col - 1] == 'W') {
            rowHits = 0;
            for (int k = col; k < cols; ++k) {
                if (grid[row][k] == 'W')
                    // stop the scan when we hit the wall.
                    break;
                else if (grid[row][k] == 'E')
                    rowHits += 1;
            }
        }
        return rowHits;
    }
}
