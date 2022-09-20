package io.gdfbarbosa.algorithms.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindIndexFirstOccurrenceStringTest {

    @Test
    public void strStr1() {
        FindIndexFirstOccurrenceString findIndexFirstOccurrenceString = new FindIndexFirstOccurrenceString();
        assertEquals(0, findIndexFirstOccurrenceString.strStr("sadbutsad", "sad"));
    }

    @Test
    public void strStr2() {
        FindIndexFirstOccurrenceString findIndexFirstOccurrenceString = new FindIndexFirstOccurrenceString();
        assertEquals(4, findIndexFirstOccurrenceString.strStr("leetcode", "code"));
    }

    @Test
    public void strStr3() {
        FindIndexFirstOccurrenceString findIndexFirstOccurrenceString = new FindIndexFirstOccurrenceString();
        assertEquals(-1, findIndexFirstOccurrenceString.strStr("juvenal", "leticia"));
    }

    @Test
    public void strStr4() {
        FindIndexFirstOccurrenceString findIndexFirstOccurrenceString = new FindIndexFirstOccurrenceString();
        assertEquals(4, findIndexFirstOccurrenceString.strStr("mississippi","issip"));
    }
}