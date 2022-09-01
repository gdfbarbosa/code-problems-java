package io.gdfbarbosa.algorithms;

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
        String representation = new String();
        for(int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            representation += morseCodes[pos];
        }
        return representation;
    }

    public static void main(String[] args) {
        MorseCode morseCode = new MorseCode();
        System.out.println(morseCode.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }
}
