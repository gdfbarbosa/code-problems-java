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

        int sLength = s.length();
        for (int right = 0; right < sLength; right++) {
            int charRight = s.charAt(right) - 'A';
            freq[charRight]++;
            // calculate max frequent letter
            mostFreqLetter = Math.max(mostFreqLetter, freq[charRight]);
            // window size = (right - left + 1)
            // windows size - mostFreqLetter
            while (right - left + 1 - mostFreqLetter > k) {
                int charLeft = s.charAt(left) - 'A';
                freq[charLeft]--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
