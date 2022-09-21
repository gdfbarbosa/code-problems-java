package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestRepeatingCharacterReplacementTest {
    @Test
    public void characterReplacement1() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));
    }

    @Test
    public void characterReplacement2() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }

    @Test
    public void characterReplacement3() {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }
}