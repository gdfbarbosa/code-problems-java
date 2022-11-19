package io.gdfbarbosa.algorithms.bitwise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertNumberHexadecimalTest {
    @Test
    public void toHexZero() {
        assertEquals("0", new ConvertNumberHexadecimal().toHex(0));
    }

    @Test
    public void toHexPositiveNumber() {
        assertEquals("1a", new ConvertNumberHexadecimal().toHex(26));
    }

    @Test
    public void toHexNegativeNumber() {
        assertEquals("ffffffff", new ConvertNumberHexadecimal().toHex(-1));
    }
}