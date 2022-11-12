package io.gdfbarbosa.algorithms.arrays;

/**
 * <a href="https://leetcode.com/problems/moving-average-from-data-stream/description/">346. Moving Average from Data Stream</a>
 */
public class MovingAverageFromDataStream {
    private final int[] queue;
    private int size;
    private double sum;
    private int index;

    public MovingAverageFromDataStream(int size) {
        this.queue = new int[size];
        this.size = 0;
        this.sum = 0.0;
        this.index = 0;
    }

    public double next(int val) {
        if (this.size < this.queue.length) this.size++;
        this.sum = this.sum - this.queue[this.index];
        this.sum = this.sum + val;
        this.queue[this.index] = val;
        this.index = (this.index+1) % this.queue.length;
        return this.sum / this.size;
    }
}
