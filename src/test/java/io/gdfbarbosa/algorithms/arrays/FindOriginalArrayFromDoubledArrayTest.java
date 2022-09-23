package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOriginalArrayFromDoubledArrayTest {
    @Test
    public void findOriginalArray1() {
        FindOriginalArrayFromDoubledArray findOriginalArrayFromDoubledArray = new
                FindOriginalArrayFromDoubledArray();
        assertArrayEquals(new int[]{1,3,4},
                findOriginalArrayFromDoubledArray.findOriginalArray(new int[]{1,3,4,2,6,8}));
    }

    @Test
    public void findOriginalArray2() {
        FindOriginalArrayFromDoubledArray findOriginalArrayFromDoubledArray = new
                FindOriginalArrayFromDoubledArray();
        assertArrayEquals(new int[]{},
                findOriginalArrayFromDoubledArray.findOriginalArray(new int[]{6,3,0,1}));
    }

    @Test
    public void findOriginalArray3() {
        FindOriginalArrayFromDoubledArray findOriginalArrayFromDoubledArray = new
                FindOriginalArrayFromDoubledArray();
        assertArrayEquals(new int[]{},
                findOriginalArrayFromDoubledArray.findOriginalArray(new int[]{1}));
    }
}