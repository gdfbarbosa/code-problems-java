package io.gdfbarbosa.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/bulls-and-cows/">299. Bulls and Cows</a>
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        Map<Character, Integer> mapSecret = new HashMap<>();
        for (char c : secret.toCharArray()) {
            mapSecret.put(c, mapSecret.getOrDefault(c, 0) + 1);
        }

        int n = guess.length();
        for (int i = 0; i < n; i++) {
            if (mapSecret.containsKey(guess.charAt(i))) {
                if (guess.charAt(i) == secret.charAt(i)) bulls++;
                if (guess.charAt(i) != secret.charAt(i)) cows++;
                if (mapSecret.getOrDefault(guess.charAt(i), 0) <= 0) {
                    cows--;
                }
                mapSecret.put(guess.charAt(i), mapSecret.getOrDefault(guess.charAt(i), 0) - 1);
            }
        }
        return bulls + "A" + cows + "B";
    }
}
