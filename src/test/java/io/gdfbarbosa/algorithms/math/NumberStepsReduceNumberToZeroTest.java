package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberStepsReduceNumberToZeroTest {

    @Test
    public void numberOfSteps() {
        assertEquals(6, new NumberStepsReduceNumberToZero().numberOfSteps(14));
    }
}