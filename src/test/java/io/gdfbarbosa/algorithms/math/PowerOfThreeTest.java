package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThreeTest {
    @Test
    public void test1() {
        PowerOfThree powerOfThree = new PowerOfThree();
        Assert.assertTrue(powerOfThree.isPowerOfThree(9));
    }

    @Test
    public void test2() {
        PowerOfThree powerOfThree = new PowerOfThree();
        Assert.assertFalse(powerOfThree.isPowerOfThree(11));
    }
}
