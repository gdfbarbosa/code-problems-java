package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    @Test
    public void maxSubArray1() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    public void maxSubArray2() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(1, maximumSubarray.maxSubArray(new int[]{1}));
    }

    @Test
    public void maxSubArray3() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(23, maximumSubarray.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}