package io.gdfbarbosa.algorithms.bitwise;

/**
 * <a href="https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/">405. Convert a Number to Hexadecimal</a>
 */
public class ConvertNumberHexadecimal {
    private static final char[] HEX_CODES = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public String toHex(int num) {
        if (num == 0) { // edge case
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0 && num != 0; i--) {
            sb.insert(0, HEX_CODES[num & 0xF]);
            num >>= 4; // shift 4 bits to right, i.e. next digit
        }
        return sb.toString();
    }
}
