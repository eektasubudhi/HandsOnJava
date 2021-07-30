package com.prac.array;

public class OneAway {
    public static void main(String[] args) {
        String s1 = "pale"; // if one character removed or replaced or added.
        String s2 = "pales";

        boolean res = matchFound(s1, s2);
        System.out.println("Match found: "+res);
    }
    static boolean matchFound(String s1, String s2){
        int count = 0;
        String srt = null;
        String lng = null;
        if(s1.length() >= s2.length()) {
            srt = s2;
            lng = s1;
        }else {
            srt = s1;
            lng =s2;
        }
        int index1 = 0;
        int index2 = 0;
        if(srt.length() == lng.length()) {
            while (index1 < srt.length() && index1 < lng.length()) {
                if (srt.charAt(index1) != lng.charAt(index1)) {
                    count++;
                }
                index1++;
            }
            if (count > 1) return false;
        }else {
            count = 0;
            if(lng.length()-srt.length()>1) return false;
            while (index1 < srt.length() && index2 < lng.length()) {
                if (srt.charAt(index1) != lng.charAt(index2)) {
                    count++;
                    index2++;
                }else{
                    index1++;
                    index2++;
                }
            }
            if (count>1) return false;
        }
        return true;
    }
}
