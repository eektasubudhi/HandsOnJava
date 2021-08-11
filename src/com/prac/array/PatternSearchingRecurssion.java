package com.prac.array;

public class PatternSearchingRecurssion {
    public static void main(String[] args) {
        String input = "suvjgjfemghtefdsnmkudde";
        //output - 3 - number of time the pattern string found in the whole string.
        String pattern = "sue";

        int number = SearchNoOfTimeStringFound(input, pattern, new StringBuilder());
        System.out.println(number+" :No. of time present");

    }
    public static int SearchNoOfTimeStringFound(String input, String pattern, StringBuilder sd){
        int count = 0;
        int index = 0;
        if(pattern.length() == 0 || input.length() == 0) return 0;
        //suvjgjfemghtefdsnmkudde
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == pattern.charAt(index) && sd.length() <= pattern.length()){
                sd.append(input.charAt(i));
            }
        }
        return count;
    }

}
