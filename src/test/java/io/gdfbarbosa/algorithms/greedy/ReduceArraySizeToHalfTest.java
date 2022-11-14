package io.gdfbarbosa.algorithms.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceArraySizeToHalfTest {
    @Test
    public void minSetSize1() {
        assertEquals(2, new ReduceArraySizeToHalf().minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }

    @Test
    public void minSetSize2() {
        assertEquals(1, new ReduceArraySizeToHalf().minSetSize(new int[]{7, 7, 7, 7, 7, 7, 7, 7}));
    }
}