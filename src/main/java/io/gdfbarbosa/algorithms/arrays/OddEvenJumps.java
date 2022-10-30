package io.gdfbarbosa.algorithms.arrays;

import java.util.Map;
import java.util.TreeMap;

/**
 * Solution credits to <a href="https://leetcode.com/problems/odd-even-jump/solutions/217981/java-c-python-dp-using-map-or-stack/?orderBy=most_votes">lee215</a>.
 * <a href="https://leetcode.com/problems/odd-even-jump/description/">975. Odd Even Jump</a>
 */
public class OddEvenJumps {
    public int oddEvenJumps(int[] arr) {
        int n  = arr.length;
        int res = 1;
        boolean[] higher = new boolean[n];
        boolean[] lower = new boolean[n];
        higher[n - 1] = lower[n - 1] = true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(arr[n - 1], n - 1);
        for (int i = n - 2; i >= 0; --i) {
            Map.Entry<Integer, Integer> hi = map.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> lo = map.floorEntry(arr[i]);
            if (hi != null) higher[i] = lower[hi.getValue()];
            if (lo != null) lower[i] = higher[lo.getValue()];
            if (higher[i]) res++;
            map.put(arr[i], i);
        }
        return res;
    }
}
