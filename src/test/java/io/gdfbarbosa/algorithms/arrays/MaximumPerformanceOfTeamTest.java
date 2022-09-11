package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumPerformanceOfTeamTest {
    MaximumPerformanceOfTeam maximumPerformanceOfTeam = new MaximumPerformanceOfTeam();
    @Test
    public void test1() {
        Assert.assertEquals(60, maximumPerformanceOfTeam.maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 2));
    }
}
