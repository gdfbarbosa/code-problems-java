package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">424. Longest Repeating Character Replacement</a>
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/discuss/358879/Java-Solution-Explained-and-Easy-to-Understand-for-Interviews">Credits to user doej4566</a>
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            // calculate max frequent letter
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);
            // window size, important to calculate chars replacement
            while (right - left + 1 - mostFreqLetter > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
