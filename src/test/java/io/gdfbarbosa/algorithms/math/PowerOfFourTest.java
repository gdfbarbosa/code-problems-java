package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfFourTest {
    @Test
    public void test1() {
        PowerOfFour powerOfFour = new PowerOfFour();
        Assert.assertTrue(powerOfFour.isPowerOfFour(16));
    }

    @Test
    public void test2() {
        PowerOfFour powerOfFour = new PowerOfFour();
        Assert.assertFalse(powerOfFour.isPowerOfFour(15));
    }
}
