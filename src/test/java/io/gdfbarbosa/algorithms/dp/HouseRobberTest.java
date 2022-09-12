package io.gdfbarbosa.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void test1() {
        HouseRobber houseRobber = new HouseRobber();
        Assert.assertEquals(4, houseRobber.rob(new int[]{1,2,3,1}));
    }
}
