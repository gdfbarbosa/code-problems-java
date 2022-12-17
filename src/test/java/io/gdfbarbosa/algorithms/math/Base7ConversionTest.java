package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class Base7ConversionTest {

    @Test
    public void convert100() {
        assertEquals("202", new Base7Conversion().convertToBase7(100));
    }

    @Test
    public void convertMinus7() {
        assertEquals("-10", new Base7Conversion().convertToBase7(-7));
    }
}