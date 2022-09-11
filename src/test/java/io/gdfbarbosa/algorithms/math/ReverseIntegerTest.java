package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test()
    public void testMinus121() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
    }
}
