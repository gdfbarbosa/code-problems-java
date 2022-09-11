package io.gdfbarbosa.algorithms.strings;

/**
 * <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[26];
        for (char c : magazine.toCharArray()) {
            counter[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (counter[c-'a'] == 0) return false;
            counter[c-'a']--;
        }
        return true;
    }
}
