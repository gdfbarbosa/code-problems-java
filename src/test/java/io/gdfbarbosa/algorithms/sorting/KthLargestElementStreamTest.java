package io.gdfbarbosa.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementStreamTest {

    @Test
    public void kthlargestElement1() {
        KthLargestElementStream kthLargestElementStream = new KthLargestElementStream(3, new int[]{4, 5, 8});
        assertEquals(4, kthLargestElementStream.add(3));
        assertEquals(5, kthLargestElementStream.add(5));
        assertEquals(5, kthLargestElementStream.add(10));
        assertEquals(8, kthLargestElementStream.add(9));
        assertEquals(8, kthLargestElementStream.add(4));
    }
}