package io.gdfbarbosa.algorithms.sorting;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/description/">703. Kth Largest Element in a Stream</a>
 */
public class KthLargestElementStream {
    Queue<Integer> heap;
    int k;

    public KthLargestElementStream(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (this.heap.size() == k) {
            Integer value = this.heap.peek();
            if (value != null && val > value) {
                this.heap.poll();
                this.heap.add(val);
            }
        } else {
            this.heap.add(val);
        }
        Integer value = this.heap.peek();
        return value != null ? value : 0;
    }
}
