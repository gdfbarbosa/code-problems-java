package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindAllAnagramsStringTest {
    @Test
    public void findAnagrams1() {
        FindAllAnagramsString findAllAnagramsString = new FindAllAnagramsString();
        assertEquals(Arrays.asList(0,6), findAllAnagramsString.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void findAnagrams2() {
        FindAllAnagramsString findAllAnagramsString = new FindAllAnagramsString();
        assertEquals(Arrays.asList(0,1,2), findAllAnagramsString.findAnagrams("abab", "ab"));
    }
}