package com.prac.array;

public class StringCompressNew {
    static char[] chars = {'a','a','b','b','c','c','c'};
    public static void main(String[] args) {
        String input = "jggffrrrr"; //output - j1g2f2r4

        String output = CompressTheString(input);
        System.out.println(output+ " : Result");

        System.out.println("------------------====-------------------");

          // o/p -> {'a','2','b','2','c','3'};
        int outputNew = CompressTheStringNewLeet(chars);
        for(char c: chars) System.out.println(c);
    }
    public static String CompressTheString(String input){
        StringBuilder sd = new StringBuilder();
        int charCount =1;
        int i = 0;
        for(; i < input.length() - 1; i++){
            if(input.charAt(i) == input.charAt(i + 1)) charCount++;
            else{
                sd.append(String.valueOf(input.charAt(i)));
                sd.append(String.valueOf(charCount));
                charCount = 1;
            }
        }
        sd.append(String.valueOf(input.charAt(i)));
        sd.append(String.valueOf(charCount));
        return sd.toString();
    }
    public static int CompressTheStringNewLeet(char[] chars) {
        int i = 0, newLength = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[newLength++] = currentChar;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[newLength++] = c;
                }
            }
        }
        return newLength;
    }

}
