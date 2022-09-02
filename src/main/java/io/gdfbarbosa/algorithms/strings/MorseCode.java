package io.gdfbarbosa.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {
    public static String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> hashes = new HashSet<>();
        for(String word : words) {
            hashes.add(getMorseRepresentation(word));
        }
        return hashes.size();
    }

    public String getMorseRepresentation(String word) {
        StringBuilder representation = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            representation.append(morseCodes[pos]);
        }
        return representation.toString();
    }
}
