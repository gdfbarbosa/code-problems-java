package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculate() {
        assertEquals(23, new Calculator().calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void calculate2() {
        assertEquals(3, new Calculator().calculate("1-(     -2)"));
    }
}