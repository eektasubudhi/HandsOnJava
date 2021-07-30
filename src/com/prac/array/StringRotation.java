package com.prac.array;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "bottlewater"; // if s2 is rotated form of s1 or substring

        boolean res = isSubstring(s1,s2);
        System.out.println("String is Rotated : "+res);
    }
    public static boolean isSubstring(String s1, String s2){
        if(s2.length() != s1.length()) return false;
        String s3 = s1+s1;
        if(s3.contains(s2)) return true;

        return false;
    }
}
