package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    @Test()
    public void testNumberThree() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(3, romanToInteger.romanToInteger("III"));
    }

    @Test()
    public void testNumberNine() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(9, romanToInteger.romanToInteger("IX"));
    }

    @Test()
    public void testNumberEleven() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(11, romanToInteger.romanToInteger("XI"));
    }

    @Test()
    public void test1994() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(1994, romanToInteger.romanToInteger("MCMXCIV"));
    }
}
