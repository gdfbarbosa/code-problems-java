package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresSortedArrayTest {
    @Test
    public void sortedSquares1() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, new SquaresSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    public void sortedSquares2() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, new SquaresSortedArray().sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}