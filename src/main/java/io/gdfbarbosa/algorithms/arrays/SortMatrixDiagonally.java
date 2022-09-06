package io.gdfbarbosa.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/sort-the-matrix-diagonally/">1329. Sort the Matrix Diagonally</a>
 */
public class SortMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length; int n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> mapDiagonalls = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mapDiagonalls.putIfAbsent(i - j, new PriorityQueue<>());
                mapDiagonalls.get(i - j).add(mat[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Integer value = mapDiagonalls.get(i - j).poll();
                if (value != null) mat[i][j] = value;
            }
        }
        return mat;
    }
}
