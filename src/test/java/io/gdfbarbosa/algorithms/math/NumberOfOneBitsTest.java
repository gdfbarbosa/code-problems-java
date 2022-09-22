package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOneBitsTest {
    @Test
    public void hammingWeighTest1() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        assertEquals(3, numberOfOneBits.hammingWeight(11));
    }

    @Test
    public void hammingWeighTest2() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        assertEquals(1, numberOfOneBits.hammingWeight(128));
    }

    @Test
    public void hammingWeighTest3() {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        // Tip: -3 in Java is represented using 2's complement notation
        assertEquals(31, numberOfOneBits.hammingWeight(-3));
    }
}