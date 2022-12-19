package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome1() {
        assertTrue(new ValidPalindrome().isPalindrome("ama"));
    }

    @Test
    public void isPalindrome2() {
        assertTrue(new ValidPalindrome().isPalindrome("caac"));
    }

    @Test
    public void isPalindrome3() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}