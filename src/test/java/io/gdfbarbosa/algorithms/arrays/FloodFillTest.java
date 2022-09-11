package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FloodFillTest {
    FloodFill floodFill = new FloodFill();
    @Test
    public void test1() {
        Assert.assertTrue(Arrays.deepEquals(
                new int[][]{{2,2,2},{2,2,0},{2,0,1}},
                floodFill.floodFill(
                        new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2)));
    }
    @Test
    public void test2() {
        Assert.assertTrue(Arrays.deepEquals(
                new int[][]{{0,0,0},{0,0,0}},
                floodFill.floodFill(
                        new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0)));
    }
}
