package io.gdfbarbosa.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void test() {
        InsertionSort insertionSort = new InsertionSort();
        Assert.assertArrayEquals(new int[]{1,5,6,7,9,10,20,30,32,55,70}, insertionSort.sort(new int[]{30,20,10,5,70,55,32,1,9,7,6}));
    }
}
