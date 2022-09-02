package io.gdfbarbosa.algorithms.strings;

import java.util.Stack;

public class DecodeString {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String tmp_string;

        while (i < s.length()) {
            char c = s.charAt(i);
            i++;

            if (c == '[') {
                tmp_string = decodeString(s); // do subproblem
                sb.append(String.valueOf(tmp_string).repeat(Math.max(0, count)));
                count = 0; // reset counter
            } else if (c == ']') { // subproblem complete
                break;
            } else if (Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                count = count * 10 + c - '0';
            }
        }

        return sb.toString();
    }
}
