package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a>
 */
public class FindIndexFirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i < h; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i + j == h) return -1;
                if (needleArray[j] != haystackArray[i+j]) break;
                if (++count == n) return i;
            }
        }
        return -1;
    }
}
