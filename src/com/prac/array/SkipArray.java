package com.prac.array;

import javax.sound.midi.SysexMessage;
import java.util.HashSet;

public class SkipArray {

    public int[] sumFound(int[] numbers, int num){
        int[] minusArr = new int[numbers.length];
        int[] fin = new int[2];
        for(int i=0;i<numbers.length;i++){
            int temp = num - numbers[i];
            minusArr[i] = temp;
        }
        HashSet<Integer> mySet = new HashSet<Integer>();
        for(int a : numbers){
            mySet.add(a);
        }
        int count=0;
        for(int b: minusArr){
            if(mySet.contains(b)){
                fin[count++]= b;
            }
        }
        for(int a : fin){
            System.out.println(a);
        }
        return fin;
    }
    public static void main(String[] args){
        //System.out.println("Hello Eekta");
        SkipArray s = new SkipArray();
        int[] numbers = {1,2,4,3,5};
        s.sumFound(numbers, 9); // pairs of number equal to given same
    }
}
