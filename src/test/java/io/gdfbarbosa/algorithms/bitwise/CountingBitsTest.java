package io.gdfbarbosa.algorithms.bitwise;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {
    @Test
    public void countBits2() {
        assertArrayEquals(new int[]{0,1,1}, new CountingBits().countBits(2));
    }

    @Test
    public void countBits57() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4}, new CountingBits().countBits(57));
    }
}