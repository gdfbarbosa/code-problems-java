package io.gdfbarbosa.algorithms.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Longest substring with two characters.
 * Great example of sliding window technique with two pointers (left and right).
 * <a href="https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/">159. Longest Substring with At Most Two Distinct Characters</a>
 */
public class LongestSubstringMaxTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int k = 3;
        int n = s.length();
        if (n < k) {
            return n;
        }
        // char => position
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = k - 1;
        // sliding window with two pointers
        int left = 0, right = 0;
        while (right < n) {
            map.put(s.charAt(right), right++);
            if (map.size() == k) {
                int idx = Collections.min(map.values());
                // remove char from map with min idx
                map.remove(s.charAt(idx));
                // move left pointer to the right
                left = idx + 1;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
