package com.prac.array;

public class Urlify {
    public static void main(String[] args) {
        String input= "Mr Jorge bing"; // add a certain string replacing space
        int length = input.length();
        String result = ReplaceSpace(input, length);
        System.out.println(result+" : Replaced String");
    }
    public static String ReplaceSpace(String input, int length){
        StringBuilder sd = new StringBuilder();
        //for (char c: inpStrArr) System.out.println(c);
        for(int i=0; i<length;i++){
            if(input.charAt(i)==' '){
                sd.append("%20");
            }
            else sd.append(String.valueOf(input.charAt(i)));
        }
        return sd.toString();
    }
}
