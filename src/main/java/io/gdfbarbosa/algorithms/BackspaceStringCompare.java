package io.gdfbarbosa.algorithms;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }

    public String getString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char character = s.charAt(i);
            if (character == '#') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    sb = new StringBuilder().append(character).append(sb);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        System.out.println(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceStringCompare.backspaceCompare("ab#c",
                "ad#c"));
    }
}
