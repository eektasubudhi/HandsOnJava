package com.prac.array;

import java.util.Stack;

public class StringCompress {
    public static void main(String[] args) {
        //String s = "aabcccccaaa";//Result :: a2b1c5a3
        //String s = "abcccccz";
        //String s = "abcd";
        //String s = "aabacbccczzcz"; // output - a2b1a1c1b1c3z2c1z1
        String s = "a";
        String compressedStr  = compressString(s);
        System.out.println(compressedStr);
        /*int a = 10;
        int b = 2;
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println(a); //2
        System.out.println(b); //10
        */
    }
    public static String compressString(String s){
        int count = 1;
        char lastChar = s.charAt(0);
        StringBuilder sd = new StringBuilder();
        if(s.length() == 0) return "no string available";
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == lastChar){
                count++;
            }
            else {
                sd.append(lastChar);
                sd.append(String.valueOf(count));
                count = 1;
                lastChar = s.charAt(i);
            }

        }
        sd.append(lastChar);
        sd.append(String.valueOf(count));
        return sd.toString();
    }
}
