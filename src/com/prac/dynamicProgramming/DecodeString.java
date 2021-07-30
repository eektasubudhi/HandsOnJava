package com.prac.dynamicProgramming;

import java.util.Stack;

public class DecodeString {
    static int index = 0;
    public static void main(String[] args) {
        String s = "3[a2[c]]"; //
        String output = decode(s);
        System.out.println(output + " : Result of recursion");

        String result = decodeUsingStack(s);
        System.out.println(result + " : output using stack");
    }
    public static String decode(String s){
        StringBuilder sd = new StringBuilder();
        while(index < s.length() && s.charAt(index) != ']'){
            if(!Character.isDigit(s.charAt(index))){
                sd.append(s.charAt(index));
                index++;
            }
            else{
                int k = 0;
                while(index < s.length() && Character.isDigit(s.charAt(index))){
                    k = k * 10 + s.charAt(index) - '0';
                    index++;
                }
                index++;
                String resultStr = decode(s);
                index++;
                while(k-- > 0){
                    sd.append(resultStr);
                }
            }
        }
        return new String(sd);
    }
    public static String decodeUsingStack(String s){
        StringBuilder sd = new StringBuilder(); //3[a2[c]]
        Stack<StringBuilder> stringSt = new Stack<>();
        Stack<Integer> numSt = new Stack<>();
        int k = 0;
        for(char c : s.toCharArray()){
            if (Character.isDigit(c)){
                k = k * 10 + c - '0';
            } else if (c == '[') {
                numSt.push(k);
                stringSt.push(sd);
                sd = new StringBuilder();
                k = 0;
            } else if (c == ']'){
                StringBuilder decodeString = stringSt.pop();
                for(int i = numSt.pop(); i > 0; i--){
                    decodeString.append(sd);
                }
                sd = decodeString;
            } else sd.append(c);
        }

        return sd.toString();
    }
}
