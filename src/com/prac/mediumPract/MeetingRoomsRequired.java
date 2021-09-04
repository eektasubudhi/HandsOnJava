package com.prac.mediumPract;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsRequired {
    public static void main(String[] args) {
        int[][] input = {{0,30},{5,10},{15,20}};
        MeetingRoomsRequired obj = new MeetingRoomsRequired();
        int res = obj.minMeetingRoomsRequired(input);
        System.out.println("Minimum rooms required for all meetings : " + res);
    }
    public int minMeetingRoomsRequired(int[][] input){
        int count = 0;
        Integer[] start = new Integer[input.length];
        Integer[] end = new Integer[input.length];
        for(int i = 0; i < input.length; i++){
            start[i] = input[i][0];
            end[i] = input[i][1];
        }
        Arrays.sort(start, (a,b) -> a - b);
        Arrays.sort(end, (a,b) -> a - b);
        /*Arrays.sort(start, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a - b;
            }
        });
        Arrays.sort(end, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return a - b;
            }
        });*/
        int srt = 0, en  = 0;
        while(srt < input.length){
            if(start[srt] >= end[en]){
                count--;
                en++;
            }
            srt++;
            count++;
        }
        return count;
    }
}
