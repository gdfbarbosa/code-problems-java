package io.gdfbarbosa.algorithms.greedy;

import java.util.Arrays;

/**
 * Solve problem using greedy approach as order of asteroids does not matter.
 * <a href="https://leetcode.com/problems/destroying-asteroids/description/">2126. Destroying Asteroids</a>
 */
public class DestroyingAsteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        // greedy approach, sort array first
        Arrays.sort(asteroids);

        long totalMass = mass;
        for (int weigth : asteroids) {
            // destroy asteroid
            if (weigth <= totalMass) {
                totalMass += weigth;
            } else {
                return false;
            }
        }
        return true;
    }
}
