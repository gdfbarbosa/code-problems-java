package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthTribonacciNumberTest {
    @Test
    public void tribonacci25() {
        NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();
        assertEquals(1389537, nthTribonacciNumber.tribonacci(25));
    }

    @Test
    public void tribonacci4() {
        NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();
        assertEquals(4, nthTribonacciNumber.tribonacci(4));
    }
}