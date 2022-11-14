package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Maximum69Test {
    @Test
    public void maximum69Number1() {
        assertEquals(9969, new Maximum69().maximum69Number(9669));
    }

    @Test
    public void maximum69Number2() {
        assertEquals(9999, new Maximum69().maximum69Number(9996));
    }

    @Test
    public void maximum69Number3() {
        assertEquals(9999, new Maximum69().maximum69Number(9999));
    }
}