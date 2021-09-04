package com.prac.array;

public class StringCompressNew {
    public static void main(String[] args) {
        String input = "jggffrrrr"; //output - j1g2f2r4

        String output = CompressTheString(input);
        System.out.println(output+ " : Result");

        System.out.println("------------------====-------------------");

        char[] chars = {'a','a','b','b','c','c','c'}; // o/p -> {'a','2','b','2','c','3'};
        char[] outputNew = CompressTheStringNewLeet(chars);
        for(char c: outputNew) System.out.println(c);
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
    public static char[] CompressTheStringNewLeet(char[] input) {
        StringBuilder sd = new StringBuilder();
        //{'a','a','b','b','c','c','c'};
        int count = 1;
        int i = 0;
        for(; i < input.length - 1; i++){
            if(input[i] == input[i + 1]) {
                count++;
            }
            else{
                sd.append(input[i]);
                while(count > 0){
                    sd.append(count % 10);
                    count = count / 10;
                }
                count = 1;
            }
        }
        sd.append(input[i]);
        while(count > 0){
            sd.append(count % 10);
            count = count / 10;
        }
        System.out.println(sd.toString());
        input = new char[sd.length()];
        for(int index = 0; index < sd.length(); index++){
            input[index] = sd.toString().charAt(index);
        }
        return input;
    }

}
