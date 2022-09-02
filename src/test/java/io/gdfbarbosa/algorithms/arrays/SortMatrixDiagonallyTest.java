package io.gdfbarbosa.algorithms.arrays;

import io.gdfbarbosa.algorithms.arrays.SortMatrixDiagonally;
import org.junit.Assert;
import org.junit.Test;

public class SortMatrixDiagonallyTest {
    @Test()
    public void test() {
        SortMatrixDiagonally sortMatrixDiagonally = new SortMatrixDiagonally();
        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        int[][] expected =
                {
                        {1, 1, 1, 1},
                        {1, 2, 2, 2},
                        {1, 2, 3, 3}
                };
        Assert.assertArrayEquals(expected, sortMatrixDiagonally.diagonalSort(mat));
    }
}
