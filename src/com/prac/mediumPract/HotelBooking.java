package com.prac.mediumPract;

import java.util.Arrays;

public class HotelBooking {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5}; // arrival time
        int[] dep = {6, 2, 8}; //departure time
        int k = 1; // number of rooms in hotel

        System.out.println(canBeAccommodated1(arr, dep, k)); // can all the guest get accommodation?
    }
    public static boolean canBeAccommodated1(int[] arr, int[] dep, int k){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int indexArrival = 0, indexDeparture = 0 , count = 0;
        while (indexArrival < n && indexDeparture < n) {
            // Check the min
            if (arr[indexArrival] < dep[indexDeparture]) {
                indexArrival++;
                count++;

                // If the current count exceeds the maximum number of rooms
                if (count > k) {
                    return false;
                }
            } else {
                indexDeparture++;
                count--;
            }
        }
        return true;
    }
    public static boolean canBeAccommodated2(int[] arr, int[] dep, int k){
        Arrays.sort(arr);
        Arrays.sort(dep);
        for(int i = 0; i < arr.length; i++)
        {
            if (i + k < arr.length && arr[i + k] < dep[i])
            {
                return false;
            }
        }
        return true;
    }
}
