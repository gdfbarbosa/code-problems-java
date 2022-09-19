package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunningSum1dArrayTest {

    @Test
    public void runningSum() {
        RunningSum1dArray runningSum1dArray = new RunningSum1dArray();
        assertArrayEquals(new int[]{1,3,6,10},
                runningSum1dArray.runningSum(new int[]{1,2,3,4}));
    }

    @Test
    public void runningSum2() {
        RunningSum1dArray runningSum1dArray = new RunningSum1dArray();
        assertArrayEquals(new int[]{1,2,3,4,5},
                runningSum1dArray.runningSum(new int[]{1,1,1,1,1}));
    }
}