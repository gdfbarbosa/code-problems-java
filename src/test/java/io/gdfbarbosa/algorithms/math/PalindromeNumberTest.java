package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void isPalindromeNegativeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(-121));
    }
}