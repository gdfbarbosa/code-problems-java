package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/">1523. Count Odd Numbers in an Interval Range</a>
 *
 * <a href="https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/discuss/754726/JavaC%2B%2BPython-1-Lines">Solution Credits</a>
 */
public class CountOddNumbersInRange {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low/2;
    }
}
