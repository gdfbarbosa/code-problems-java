package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersEvenNumberDigitsTest {
    @Test
    public void findNumbers() {
        assertEquals(3, new FindNumbersEvenNumberDigits().findNumbers(new int[]{1, 22, 4444, 888888, 333, 555, 777}));
    }
}