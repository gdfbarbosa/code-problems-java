package io.gdfbarbosa.algorithms.math;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/perfect-squares/description/">279. Perfect Squares</a>
 */
public class PerfectSquares {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        Set<Integer> queue = new HashSet<>();
        queue.add(n);

        int level = 0;
        while (!queue.isEmpty()) {
            level += 1;
            Set<Integer> nextQueue = new HashSet<>();

            for (Integer remainder : queue) {
                for (Integer square : squares) {
                    if (remainder.equals(square)) {
                        return level;
                    } else if (remainder < square) {
                        break;
                    } else {
                        nextQueue.add(remainder - square);
                    }
                }
            }
            queue = nextQueue;
        }
        return level;
    }
}
