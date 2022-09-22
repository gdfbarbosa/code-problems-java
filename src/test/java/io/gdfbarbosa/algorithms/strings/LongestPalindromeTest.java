package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {
    @Test
    public void longestPalindromeTest1() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
    }

    @Test
    public void longestPalindromeTest2() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertEquals(1, longestPalindrome.longestPalindrome("a"));
    }

    @Test
    public void longestPalindromeTest3() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertEquals(4, longestPalindrome.longestPalindrome("aabb"));
    }
}