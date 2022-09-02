package io.gdfbarbosa.algorithms.dp;

import io.gdfbarbosa.algorithms.dp.MinCostClimbingStars;
import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbingStarsTest {
    @Test
    public void test() {
        MinCostClimbingStars minCostClimbingStars = new MinCostClimbingStars();
        Assert.assertEquals(6, minCostClimbingStars.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    @Test
    public void test2() {
        MinCostClimbingStars minCostClimbingStars = new MinCostClimbingStars();
        Assert.assertEquals(15, minCostClimbingStars.minCostClimbingStairs(new int[]{10,15,20}));
    }
}
