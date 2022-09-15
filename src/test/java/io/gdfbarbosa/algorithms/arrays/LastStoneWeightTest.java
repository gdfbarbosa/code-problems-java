package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LastStoneWeightTest {
    @Test
    public void test1() {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        Assert.assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
