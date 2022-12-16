package io.gdfbarbosa.algorithms.math;

/**
 * <a href="https://leetcode.com/problems/construct-the-rectangle/description/">492. Construct the Rectangle</a>
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
}
