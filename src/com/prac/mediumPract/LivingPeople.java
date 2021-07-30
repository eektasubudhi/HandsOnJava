package com.prac.mediumPract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivingPeople {
    public static void main(String[] args) {
        List<int[]> people = new ArrayList<>();
        int[] p1 = new int[2];
        p1[0] = 1901;
        p1[1] = 1980;
        people.add(p1);

        int[] p2 = new int[2];
        p2[0] = 1980;
        p2[1] = 2000;
        people.add(p2);

        int[] p3 = new int[2];
        p3[0] = 1920;
        p3[1] = 1980;
        people.add(p3);

        int[] p4 = new int[2];
        p4[0] = 1950;
        p4[1] = 1960;
        people.add(p4);

        int[] p5 = new int[2];
        p5[0] = 1900;
        p5[1] = 1925;
        people.add(p5);

        int[] p6 = new int[2];
        p6[0] = 1970;
        p6[1] = 2000;
        people.add(p6);

        int[] p7 = new int[2];
        p7[0] = 1905;
        p7[1] = 1975;
        people.add(p7);

        int maxLivedYear = livingPeopleCalculator(people);
        System.out.println("Most alive people are there in the year of : "+maxLivedYear);
    }
    public static int livingPeopleCalculator(List<int[]> people){
        Map<Integer, Integer> yearCount = new HashMap<>();
        int maxYr = 0;
        for(int i = 0; i < people.size(); i++){
            int bYr = people.get(i)[0];
            int dYr = people.get(i)[1];
           // int iter = dYr-bYr;
            maxYr =bYr;
            int maxEntry = 0;
            for(int j = bYr; j <= dYr; j++){
                yearCount.put(j,yearCount.getOrDefault(j,0)+1);
                if(yearCount.get(j)>maxEntry){
                    maxEntry = yearCount.get(j);
                    maxYr = j;
                }
            }
        }
       /* int maxYr = 0;
        int maxEntry = 0;
        for(Map.Entry<Integer, Integer> en : yearCount.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
            if(en.getValue()>maxEntry){
                maxEntry = en.getValue();
                maxYr = en.getKey();
            }
        }*/
       return maxYr;
    }

}
