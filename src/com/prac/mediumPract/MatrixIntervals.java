package com.prac.mediumPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixIntervals {
    /* named Solution.
    Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

    Input: intervals = [[1,4],[4,5]]
    Output: [[1,5]]
    Explanation: Intervals [1,4] and [4,5] are considered overlapping.
    * If you need more classes, simply define them inline.
    */
    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18},{2,4}};//{{1,4},{4,5}};//{{1,3},{2,6},{8,10},{15,18}};
        //o/p ->
        MatrixIntervals obj = new MatrixIntervals();
        int[][] res = obj.merge(input);
        for (int[] arr : res) {
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
            System.out.println("=====");
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //int prev = intervals[0][1];
        List<int[]> myList = new ArrayList<>(); //{{1,3},{2,6},{8,10},{15,18},{2,4}}
        for(int i = 0; i < intervals.length; i++){
            if(myList.isEmpty() || myList.get(myList.size() - 1)[1] < intervals[i][0]){
                myList.add(intervals[i]);
            }else{
                int startI = myList.get(myList.size() - 1)[0];
                int endI= Math.max(myList.get(myList.size() - 1)[1], intervals[i][1]);
                int[] addArr = new int[]{startI,endI};
                myList.set(myList.size() - 1, addArr);
            }
        }
        return myList.toArray(new int[myList.size()][]);
    }
}
