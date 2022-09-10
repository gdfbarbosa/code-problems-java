package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String palindromeOdd = expandPalindrome(s, i, i); // odd
            String palindromeEven = expandPalindrome(s, i, i+1); // even
            if (palindromeEven.length() > longest.length()) {
                longest = palindromeEven;
            }
            if (palindromeOdd.length() > longest.length()) {
                longest = palindromeOdd;
            }
        }
        return longest;
    }

    public String expandPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        return s.substring(j+1, k);
    }
}
