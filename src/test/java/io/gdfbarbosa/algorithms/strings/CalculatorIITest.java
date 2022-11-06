package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorIITest {
    @Test
    public void calculateSimpleSum() {
        CalculatorII calculatorII = new CalculatorII();
        assertEquals(5, calculatorII.calculate("2+3"));
    }

    @Test
    public void calculateSimpleSubtraction() {
        CalculatorII calculatorII = new CalculatorII();
        assertEquals(-1, calculatorII.calculate("2-3"));
    }

    @Test
    public void calculateSimpleMultiplication() {
        CalculatorII calculatorII = new CalculatorII();
        assertEquals(5, calculatorII.calculate("2*3-1"));
    }

    @Test
    public void calculateSimpleDivision() {
        CalculatorII calculatorII = new CalculatorII();
        assertEquals(7, calculatorII.calculate("2*3/2 + 4 "));
    }


}