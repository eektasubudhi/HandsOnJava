package com.prac.array;

public class InsertionSort {
    public static void main(String[] args) {
       int[] arr= {40,55,2,5,61,17,8};
       int temp;
        for(int i =1; i<arr.length;++i){
            int key  = arr[i];
            int pointer = i-1;
            while(pointer>=0 && key<arr[pointer]) {
                //arr[i], arr[pointer]
                temp =arr[pointer];
                arr[pointer]=arr[pointer+1];
                arr[pointer+1]=temp;
                pointer--;
            }
//
//                arr[pointer+1] = arr[pointer];
//                pointer =pointer- 1;
//            }
//            arr[pointer+1] = key;
        }
        for (int i: arr) {
            System.out.println(i);
        }
        /*int[] arr= {40,55,2,5,61,17,8};
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        int a = 5;
        int b =6;
         int temp =b;
         b=a;
         a=temp;
        */
    }
}
