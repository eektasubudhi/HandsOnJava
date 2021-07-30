package com.prac.mediumPract;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayByFrequency {
    Map<Integer, Integer> mp = new HashMap<>();

    public static void main(String[] args){
        int[] arr = {2, 2, 2, 6, 6, 3, 3, 3, 3, 8, 8, 8, 8, 9, 1};
        SortArrayByFrequency sq = new SortArrayByFrequency();
        List<Integer> result = sq.sortArrayByFreq(arr);
        for(int i : result) System.out.println(i);
    }
    public List<Integer> sortArrayByFreq(int[] arr) {
        List<Integer> output = new ArrayList<>();
        for(int i : arr){
            int val = mp.getOrDefault(i, 0);
            mp.put(i, val+1);
            output.add(i);
        }
        SortComparator sq = new SortComparator(mp);
        Collections.sort(output, sq);
        //Collections.sort(output);
        return output;
    }

}
class SortComparator implements Comparator<Integer> {
    Map<Integer, Integer> freqmap = new HashMap<>();
    public SortComparator(Map<Integer, Integer> map){
        this.freqmap = map;
    }
    public int compare(Integer i1, Integer i2) {
        int frqVal = freqmap.get(i1).compareTo(freqmap.get(i2));
        int val = i1.compareTo(i2);

        if(frqVal == 0) return val;
        return frqVal;
    }

}
