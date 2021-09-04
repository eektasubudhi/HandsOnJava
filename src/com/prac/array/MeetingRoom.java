package com.prac.array;

import com.prac.mediumPract.MatrixIntervals;

import java.util.Arrays;

public class MeetingRoom {
    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18},{2,4}};
        MeetingRoom obj = new MeetingRoom();
        boolean res = obj.isAllMeetingAttainable(input);
        System.out.println("ALL MEETINGS ARE ATTAINABLE : " + res);
    }

    public boolean isAllMeetingAttainable(int[][] input){
        Arrays.sort(input, (a, b) -> a[0] - b[0]);
        for(int i = 0; i < input.length - 1; i++){
            if(input[i][1] > input[i + 1][0]) return false;
        }
        return true;
    }
}
