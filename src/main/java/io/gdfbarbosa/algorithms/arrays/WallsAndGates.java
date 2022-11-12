package io.gdfbarbosa.algorithms.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/walls-and-gates/description/">286. Walls and Gates</a>
 */
public class WallsAndGates {
    private static final int EMPTY = 2147483647;
    private static final int GATE = 0;

    private static final List<int[]> directions = Arrays.asList(
            new int[]{0,1},
            new int[]{0,-1},
            new int[]{1,0},
            new int[]{-1,0}
    );

    public void wallsAndGates(int[][] rooms) {
        int m = rooms.length;
        int n = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == GATE) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] room = queue.poll();
            int row = room[0];
            int col = room[1];
            // walk in four directions
            for (int[] direction : directions) {
                int r = row + direction[0];
                int c = col + direction[1];
                // stop condition
                if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) {
                    continue;
                }
                rooms[r][c] = rooms[row][col] + 1;
                queue.add(new int[]{r, c});
            }
        }
    }
}
