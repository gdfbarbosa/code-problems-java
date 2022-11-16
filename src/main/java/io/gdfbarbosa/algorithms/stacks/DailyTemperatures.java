package io.gdfbarbosa.algorithms.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/daily-temperatures/description/">Daily Temperatures</a>
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] daysToWait = new int[n];
        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                daysToWait[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return daysToWait;
    }
}
