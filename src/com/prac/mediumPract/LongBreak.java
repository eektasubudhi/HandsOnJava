package com.prac.mediumPract;

import java.util.ArrayList;
import java.util.List;

public class LongBreak {
    public static void main(String[] args) {
        List<Integer> start = List.of(1, 3, 5, 6, 7, 11, 12);
        List<Integer> end = List.of(2, 4, 6, 7, 9, 12, 13);
        int n = 7; //numberOfPresentation
        int k = 3; //presentationCanBeMoved
        int t = 14; //eventEndTime

        int res = calculateTheLongBreak(start, end, n, k, t);
        System.out.println(res);
    }
    public static int calculateTheLongBreak(List<Integer> start, List<Integer> end, int n, int k, int t){
        int res = Integer.MIN_VALUE;
        List<Integer> slots = new ArrayList<>();
        int initialT = 0;

        for(int i = 0; i < start.size(); i++){
            int strt = start.get(i);
            int free = strt - initialT;
            initialT = end.get(i);
            slots.add(free);
        }
        slots.add(t - end.get(end.size() - 1));
        for(int j = 0; j < slots.size() - k; j++){
            int sum = 0;
            int temp = j;
            for(int l = 0; l <= k; l++){
                sum += slots.get(temp++);
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
