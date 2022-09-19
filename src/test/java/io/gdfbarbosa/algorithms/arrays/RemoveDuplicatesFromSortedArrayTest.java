package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicatesSmallArray() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray =
                new RemoveDuplicatesFromSortedArray();
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    public void removeDuplicatesBigArray() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray =
                new RemoveDuplicatesFromSortedArray();
        assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}