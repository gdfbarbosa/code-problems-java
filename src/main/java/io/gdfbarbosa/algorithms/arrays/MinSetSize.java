package io.gdfbarbosa.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSetSize {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);

        Integer[] frequency = map.values().toArray(new Integer[0]);

        Arrays.sort(frequency);

        int removed = 0;
        int half = arr.length / 2;
        int j = frequency.length - 1;
        int count = 0;
        while (removed < half) {
            removed += frequency[j--];
            count++;
        }
        return count;
    }
}
