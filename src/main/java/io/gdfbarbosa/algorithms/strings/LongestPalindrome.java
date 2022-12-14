package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
        }
        if (ans < s.length()) ans++;
        return ans;
    }
}
