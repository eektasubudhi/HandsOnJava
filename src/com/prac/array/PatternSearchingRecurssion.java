package com.prac.array;

public class PatternSearchingRecurssion {
    public static void main(String[] args) {
        String input = "suvjgjfemghtefdsnmkudde";
        //output - 4 - number of time the pattern string found in the whole string.
        String pattern = "sue";

        int number = SearchNoOfTimeStringFound(input, pattern, input.length(), pattern.length());
        System.out.println(number+" :No. of time present");

    }
    public static int SearchNoOfTimeStringFound(String input, String pattern, int x, int y){
        int count = 0;
        if(pattern.length()==0 || input.length()==0) return 0;
        //if(input.length()==0) return 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == pattern.charAt(i)){

            }
        }
        return count;
    }

}
