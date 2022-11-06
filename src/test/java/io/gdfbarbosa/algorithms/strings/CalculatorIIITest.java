package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorIIITest {

    @Test
    public void calculate1() {
        assertEquals(2, new CalculatorIII().calculate("1+1"));
    }

    @Test
    public void calculate2() {
        assertEquals(4, new CalculatorIII().calculate("6-4/2"));
    }

    @Test
    public void calculate3() {
        assertEquals(21, new CalculatorIII().calculate("2*(5+5*2)/3+(6/2+8)"));
    }
}