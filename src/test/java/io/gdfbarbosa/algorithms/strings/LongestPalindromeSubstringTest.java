package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeSubstringTest {
    @Test()
    public void test1() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        Assert.assertEquals(4, longestPalindromeSubstring.longestPalindrome("babadda" ).length());
    }

    @Test()
    public void test2() {
        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        Assert.assertEquals(3, longestPalindromeSubstring.longestPalindrome("babad" ).length());
    }
}
