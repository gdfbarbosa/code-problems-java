package io.gdfbarbosa.algorithms.bitwise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitsTest {

    @Test
    public void reverseBits() {
        assertEquals(2147483646, new ReverseBits().reverseBits(-3));
    }
}