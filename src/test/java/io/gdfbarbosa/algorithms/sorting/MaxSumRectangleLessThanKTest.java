package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.arrays.MaxSumRectangleLessThankK;
import org.junit.Assert;
import org.junit.Test;

public class MaxSumRectangleLessThanKTest {
    @Test
    public void test() {
        MaxSumRectangleLessThankK instance = new MaxSumRectangleLessThankK();
        int[][] matrix = {{1,1,1},{2,2,2},{3,3,3}};
        Assert.assertEquals(2, instance.maxSumSubmatrix(matrix, 2));
    }
}
