package io.gdfbarbosa.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    ClimbingStairs climbingStairs = new ClimbingStairs();
    @Test
    public void test1() {
        Assert.assertEquals(2, climbingStairs.climbStairs(2));
    }
    @Test
    public void test2() {
        Assert.assertEquals(1836311903, climbingStairs.climbStairs(45));
    }
}
