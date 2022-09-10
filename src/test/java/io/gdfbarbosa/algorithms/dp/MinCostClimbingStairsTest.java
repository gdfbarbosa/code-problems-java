package io.gdfbarbosa.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbingStairsTest {
    @Test
    public void test() {
        MinCostClimbingStairs minCostClimbingStars = new MinCostClimbingStairs();
        Assert.assertEquals(6, minCostClimbingStars.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    @Test
    public void test2() {
        MinCostClimbingStairs minCostClimbingStars = new MinCostClimbingStairs();
        Assert.assertEquals(15, minCostClimbingStars.minCostClimbingStairs(new int[]{10,15,20}));
    }
}
