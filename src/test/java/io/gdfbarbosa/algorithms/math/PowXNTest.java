package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class PowXNTest {
    @Test
    public void test1() {
        PowXN math = new PowXN();
        Assert.assertEquals(27.0, math.myPow(3, 3), 0);
    }

    @Test
    public void test2() {
        PowXN math = new PowXN();
        Assert.assertEquals(0.25, math.myPow(2, -2), 0);
    }
}
