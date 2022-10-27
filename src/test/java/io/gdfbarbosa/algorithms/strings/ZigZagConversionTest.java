package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {

    @Test
    public void convert1() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void convert2() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertEquals("PAIICSDDANPSIYRBDEFSFGHLGARDF", zigZagConversion.convert("PAHNAPLSIIGYIRABCDRESFDSDFFGD", 3));
    }

    @Test
    public void convert3() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void convert4() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        assertEquals("AB", zigZagConversion.convert("AB", 1));
    }
}