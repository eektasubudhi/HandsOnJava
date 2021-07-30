package com.prac.mediumPract;

public class PatternMatching {
    public static void main(String[] args) {
        String pattern = "aabab";
        String value = "reddreddhotreddhot";

        boolean result = isMatched(pattern, value);
        System.out.println("pattern matched to the value : "+result);
    }
    public static boolean isMatched(String pattern, String value){
        int stringLength = value.length();
        char mainChar = pattern.charAt(0);
        char altChar = mainChar == 'a' ? 'b' : 'a';
        int mainCharCount = charCount(pattern, mainChar);
        int altCharCount = charCount(pattern, altChar);
        int sizeMain = stringLength / mainCharCount;
        int sizeAlt = stringLength / altCharCount;

        return false;
    }
    public static int charCount(String pattern, char ch) {
        int count = 0;
        for (char c : pattern.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
}
