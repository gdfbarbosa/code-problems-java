package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int s1 = 0;
        int found = 0;
        int tLength = t.length();
        int sLength = s.length();
        for (int i = 0; i < tLength; i++) {
            if (found == sLength) {
                return true;
            }
            if (s.charAt(s1) == t.charAt(i)) {
                found++;
                s1++;
            }
        }
        return found == sLength;
    }
}
