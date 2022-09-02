package io.gdfbarbosa.algorithms.strings;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {
    @Test()
    public void test1() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        Assert.assertEquals(4, longestPalindrome.longestPalindrome("babadda" ).length());
    }

    @Test()
    public void test2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        Assert.assertEquals(3, longestPalindrome.longestPalindrome("babad" ).length());
    }
}
