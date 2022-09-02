package io.gdfbarbosa.algorithms.strings;

import io.gdfbarbosa.algorithms.math.MultiplyTwoStrings;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyTwoStringsTest {
    @Test()
    public void testMultiplyStrings1() {
        MultiplyTwoStrings multiplyTwoStrings = new MultiplyTwoStrings();
        Assert.assertEquals("56088", multiplyTwoStrings.multiply("123", "456"));
    }

    @Test()
    public void testMultiplyStrings2() {
        MultiplyTwoStrings multiplyTwoStrings = new MultiplyTwoStrings();
        Assert.assertEquals("0", multiplyTwoStrings.multiply("0", "0"));
    }
}
