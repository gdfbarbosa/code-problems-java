package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {
    @Test
    public void findMaxConsecutiveOnes1() {
        assertEquals(5,
                new MaxConsecutiveOnes().findMaxConsecutiveOnes(
                        new int[]{1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}));
    }

    @Test
    public void findMaxConsecutiveOnes2() {
        assertEquals(0,
                new MaxConsecutiveOnes().findMaxConsecutiveOnes(
                        new int[]{0, 0, 0, 0}));
    }

    @Test
    public void findMaxConsecutiveOnes3() {
        assertEquals(3,
                new MaxConsecutiveOnes().findMaxConsecutiveOnes(
                        new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1}));
    }
}