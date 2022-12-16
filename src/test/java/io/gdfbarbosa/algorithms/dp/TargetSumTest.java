package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class TargetSumTest {
    @Test
    public void findTargetSumWays() {
        assertEquals(2, new TargetSum().findTargetSumWays(new int[]{2,1,1,2}, 4));
    }
}