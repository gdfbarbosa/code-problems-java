package io.gdfbarbosa.algorithms.math;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {
    MultiplyStrings multiplyStrings = new MultiplyStrings();
    @Test
    public void test1() {
        Assert.assertEquals("6", multiplyStrings.multiply("3", "2"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("56088", multiplyStrings.multiply("123", "456"));
    }
}
