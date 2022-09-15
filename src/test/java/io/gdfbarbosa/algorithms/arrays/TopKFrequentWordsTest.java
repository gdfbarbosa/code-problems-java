package io.gdfbarbosa.algorithms.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TopKFrequentWordsTest {
    @Test
    public void topKFrequentTest1() {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        assertEquals(Arrays.asList("i","love"),
                topKFrequentWords.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));
    }

    @Test
    public void topKFrequentTest2() {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        assertEquals(Arrays.asList("the","is","sunny","day"),
                topKFrequentWords.topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"}, 4));
    }
}