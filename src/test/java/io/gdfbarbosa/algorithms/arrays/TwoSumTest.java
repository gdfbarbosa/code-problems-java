package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    TwoSum twoSum = new TwoSum();
    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[]{0,1}, twoSum.twoSum(new int[]{2,7,11,15}, 9));
    }
}
