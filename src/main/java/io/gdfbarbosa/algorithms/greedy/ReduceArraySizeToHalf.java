package io.gdfbarbosa.algorithms.greedy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/reduce-array-size-to-the-half/description/">1338. Reduce Array Size to The Half</a>
 */
public class ReduceArraySizeToHalf {
    public int minSetSize(int[] arr) {
        // count frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(map.values());
        int removed = 0;
        int setSize = 0;
        Collections.sort(counts);
        for (int i = counts.size() - 1; i >= 0; i--) {
            removed += counts.get(i);
            setSize++;
            if (removed >= arr.length / 2) {
                break;
            }
        }
        return setSize;
    }
}
