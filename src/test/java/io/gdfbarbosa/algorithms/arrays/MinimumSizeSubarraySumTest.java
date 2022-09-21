package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSizeSubarraySumTest {
    @Test
    public void minSubArrayLen1() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void minSubArrayLen2() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1,4,4}));
    }

    @Test
    public void minSubArrayLen3() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
    }
}