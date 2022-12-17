package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">1342. Number of Steps to Reduce a Number to Zero</a>
 */
public class NumberStepsReduceNumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}
