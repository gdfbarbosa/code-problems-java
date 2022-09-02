package io.gdfbarbosa.algorithms.math;

import io.gdfbarbosa.algorithms.math.ReorderedPowerOfTwo;
import org.junit.Assert;
import org.junit.Test;

public class ReorderedPowerOfTwoTest {
    @Test()
    public void test() {
        ReorderedPowerOfTwo reorderedPowerOfTwo = new ReorderedPowerOfTwo();
        Assert.assertEquals(16, reorderedPowerOfTwo.reorderedPowerOf2(61));
    }
}
