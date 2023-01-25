package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DuplicateZerosTest {

    @Test
    public void duplicateZeros() {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, arr);
    }

    @Test
    public void duplicateZeros2() {
        int[] arr = new int[]{1,0,2,3,0,4,5};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1,0,0,2,3,0,0}, arr);
    }
}