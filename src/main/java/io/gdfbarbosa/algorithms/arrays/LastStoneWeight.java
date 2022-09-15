package io.gdfbarbosa.algorithms.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/last-stone-weight/">1046. Last Stone Weight</a>
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(10, Collections.reverseOrder());

        for (int weight : stones) heap.add(weight);

        while (heap.size() > 1) {
            Integer y = heap.poll();
            Integer x = heap.poll();
            if (x != null && y != null && !y.equals(x)) {
                heap.add(y - x);
            }
        }
        return !heap.isEmpty() ? heap.peek() : 0;
    }
}
