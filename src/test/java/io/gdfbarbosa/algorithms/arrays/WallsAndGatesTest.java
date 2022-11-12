package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class WallsAndGatesTest {

    @Test
    public void wallsAndGates() {
        WallsAndGates wallsAndGates = new WallsAndGates();
        int[][] rooms = new int[][]{
                {2147483647, -1, 0, 2147483647},
                {2147483647, 2147483647, 2147483647, -1},
                {2147483647, -1, 2147483647, -1},
                {0, -1, 2147483647, 2147483647}};
        wallsAndGates.wallsAndGates(rooms);
        int[][] expected = new int[][]{
                {3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };
        assertArrayEquals(expected, rooms);
    }
}