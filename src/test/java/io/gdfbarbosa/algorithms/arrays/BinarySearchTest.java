package io.gdfbarbosa.algorithms.arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void test1() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(4, binarySearch.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void test2() {
        BinarySearch binarySearch = new BinarySearch();
        Assert.assertEquals(-1, binarySearch.search(new int[]{-1,0,3,5,9,12}, 99));
    }
}
