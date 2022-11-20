package io.gdfbarbosa.algorithms.bitwise;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTwoIntegersTest {

    @Test
    public void getSum() {
        assertEquals(39, new SumOfTwoIntegers().getSum(25,14));
    }
}