package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class PowXNTest {
    @Test
    public void test() {
        PowXN math = new PowXN();
        Assert.assertEquals(27.0, math.myPow(3, 3), 0);
    }
}
