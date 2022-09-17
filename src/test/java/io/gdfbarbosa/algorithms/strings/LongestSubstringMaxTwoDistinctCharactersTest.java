package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringMaxTwoDistinctCharactersTest {
    static LongestSubstringMaxTwoDistinctCharacters longestSubstringMaxTwoDistinctCharacters =
            new LongestSubstringMaxTwoDistinctCharacters();
    @Test
    public void lengthOfLongestSubstringTwoDistinct() {
        assertEquals(3, longestSubstringMaxTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    public void testMaxLength5() {
        assertEquals(5, longestSubstringMaxTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    @Test
    public void testMaxLength3() {
        assertEquals(3, longestSubstringMaxTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("cdaba"));
    }
}