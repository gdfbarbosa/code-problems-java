package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberComplementTest {
    @Test
    public void findComplement5() {
        NumberComplement numberComplement = new NumberComplement();
        assertEquals(2, numberComplement.findComplement(5));
    }

    @Test
    public void findComplement1() {
        NumberComplement numberComplement = new NumberComplement();
        assertEquals(0, numberComplement.findComplement(1));
    }
}