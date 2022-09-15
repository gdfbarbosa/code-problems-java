package io.gdfbarbosa.algorithms.arrays;

import javafx.util.Pair;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-words/">692. Top K Frequent Words</a>
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);

        PriorityQueue<Pair<String, Integer>> queue = new PriorityQueue<>(10, (o1, o2) -> {
            int compare = o2.getValue().compareTo(o1.getValue());
            if (compare == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return compare;
        });

        for (String word : map.keySet()) queue.add(new Pair<>(word, map.get(word)));

        List<String> ans = new ArrayList<>();
        while (k-- > 0) {
            Pair<String, Integer> pair = queue.poll();
            if (pair != null) ans.add(pair.getKey());
        }
        return ans;
    }
}
