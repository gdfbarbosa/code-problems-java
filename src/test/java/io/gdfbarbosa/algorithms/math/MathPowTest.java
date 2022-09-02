package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class MathPowTest {
    @Test
    public void test() {
        MathPow math = new MathPow();
        Assert.assertEquals(27.0, math.myPow(3, 3), 0);
    }
}
