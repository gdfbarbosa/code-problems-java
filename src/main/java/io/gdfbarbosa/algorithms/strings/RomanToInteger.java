package io.gdfbarbosa.algorithms.strings;

import java.util.Map;

public class RomanToInteger {
    public int romanToInteger(String s) {
        Map<String, Integer> romanToIntMap = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
        int number = 0;
        int lastValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int charValue = romanToIntMap.get(Character.toString(s.charAt(i)));
            number += lastValue > charValue ? -charValue : charValue;
            lastValue = charValue;
        }
        return number;
    }
}
