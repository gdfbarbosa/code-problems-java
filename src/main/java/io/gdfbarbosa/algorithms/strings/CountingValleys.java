package io.gdfbarbosa.algorithms.strings;

public class CountingValleys {
    public int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;
        int direction = 0;
        for (int i = 0; i <= steps; i++) {
            // check if skipped a valley
            if (i != 0 && level == 0 && direction == -1) valleys++;
            // which direction am i going?
            direction = level < 0 ? -1 : 1;
            if (i < path.length()) {
                // change level
                level += path.charAt(i) == 'D' ? -1 : 1;
            }
        }
        return valleys;
    }
}
