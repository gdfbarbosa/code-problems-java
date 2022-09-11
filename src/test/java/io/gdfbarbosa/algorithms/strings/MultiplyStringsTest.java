package io.gdfbarbosa.algorithms.strings;

import io.gdfbarbosa.algorithms.math.MultiplyStrings;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {
    @Test()
    public void testMultiplyStrings1() {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        Assert.assertEquals("56088", multiplyStrings.multiply("123", "456"));
    }

    @Test()
    public void testMultiplyStrings2() {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        Assert.assertEquals("0", multiplyStrings.multiply("0", "0"));
    }
}
