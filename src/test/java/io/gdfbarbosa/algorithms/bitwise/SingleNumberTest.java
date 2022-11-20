package io.gdfbarbosa.algorithms.bitwise;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {
    @Test
    public void singleNumber() {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{2, 2, 1}));
    }
}