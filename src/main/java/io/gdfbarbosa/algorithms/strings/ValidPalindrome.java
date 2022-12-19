package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // two pointers technique
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            // seek left pointer near next valid character
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // seek right pointer near next valid character
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

}
