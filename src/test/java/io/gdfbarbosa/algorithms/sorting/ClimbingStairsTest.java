package io.gdfbarbosa.algorithms.sorting;

import io.gdfbarbosa.algorithms.dp.ClimbingStairs;
import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void test45() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assert.assertEquals(1836311903, climbingStairs.climbStairs(45));
    }

    @Test
    public void test10() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assert.assertEquals(89, climbingStairs.climbStairs(10));
    }

    @Test
    public void test5() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assert.assertEquals(8, climbingStairs.climbStairs(5));
    }
}
