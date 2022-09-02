package io.gdfbarbosa.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BitOperationsTest {
    @Test
    public void test256shift2() {
        Assert.assertEquals(64, 256>>2);
    }

    @Test
    public void test256shift4() {
        Assert.assertEquals(16, 256>>4);
    }

    @Test
    public void test256shift6() {
        Assert.assertEquals(4, 256>>6);
    }

    @Test
    public void test256shift8() {
        Assert.assertEquals(1, 256>>8);
    }
}
