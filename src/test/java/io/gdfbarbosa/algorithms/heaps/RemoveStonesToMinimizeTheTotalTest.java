package io.gdfbarbosa.algorithms.heaps;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveStonesToMinimizeTheTotalTest {
    @Test
    public void minStoneSum1() {
        assertEquals(12, new RemoveStonesToMinimizeTheTotal().minStoneSum(new int[]{4, 3, 6, 7}, 3));
    }

    @Test
    public void minStoneSum2() {
        assertEquals(12, new RemoveStonesToMinimizeTheTotal().minStoneSum(new int[]{5, 4, 9}, 2));
    }
}