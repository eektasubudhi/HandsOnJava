package com.prac.array;

public class StringCompressNew {
    public static void main(String[] args) {
        String input = "jggffrrrr"; //output - j1g2f2r4

        String output = CompressTheString(input);
        System.out.println(output+ " : Result");
    }
    public static String CompressTheString(String input){
        StringBuilder sd = new StringBuilder();
        int charCount =1;
        int i = 0;
        for(; i < input.length()-1; i++){
            if(input.charAt(i) == input.charAt(i+1)) charCount++;
            else{
                sd.append(String.valueOf(input.charAt(i)));
                sd.append(String.valueOf(charCount));
                charCount=1;
            }
        }
        sd.append(String.valueOf(input.charAt(i)));
        sd.append(String.valueOf(charCount));
        return sd.toString();
    }
}
