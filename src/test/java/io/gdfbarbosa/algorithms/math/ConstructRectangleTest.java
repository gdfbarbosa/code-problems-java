package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructRectangleTest {

    @Test
    public void constructRectangle1() {
        assertArrayEquals(new int[]{2,2}, new ConstructRectangle().constructRectangle(4));
    }

    @Test
    public void constructRectangle2() {
        assertArrayEquals(new int[]{37,1}, new ConstructRectangle().constructRectangle(37));
    }

    @Test
    public void constructRectangle3() {
        assertArrayEquals(new int[]{427,286}, new ConstructRectangle().constructRectangle(122122));
    }
}