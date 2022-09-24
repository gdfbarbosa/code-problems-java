package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge1() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        assertArrayEquals(new int[]{1,2,3,3,4,5}, mergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{3,4,5}, 3));
    }

    @Test
    public void merge2() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        assertArrayEquals(new int[]{1}, mergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0));
    }
}