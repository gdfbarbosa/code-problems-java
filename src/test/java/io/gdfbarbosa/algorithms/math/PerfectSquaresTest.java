package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <a href="https://leetcode.com/problems/perfect-squares/description/">279. Perfect Squares</a>
 */
public class PerfectSquaresTest {

    @Test
    public void numSquares7() {
        PerfectSquares perfectSquares = new PerfectSquares();
        assertEquals(4, perfectSquares.numSquares(7));
    }

    @Test
    public void numSquares12() {
        PerfectSquares perfectSquares = new PerfectSquares();
        assertEquals(3, perfectSquares.numSquares(12));
    }
}