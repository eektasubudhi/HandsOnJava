package com.prac.array;

import java.util.Stack;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] height = {2,4,2,5};//{0,1,0,2,1,0,1,3,2,1,2,1};

        int answer = waterTrapped(height);
        System.out.println("Water tapped in unit using stack: " + answer);

        int result = waterTrappedIn(height);
        System.out.println("Water tapped in unit using 2 pointer: " + result);
    }
    //using stack
    public static int waterTrapped(int[] height){
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < height.length; i++){
            while (!st.isEmpty() && height[i] > height[st.peek()]){
               int top = st.pop();
               if(st.isEmpty()) break;
               int dist = i - st.peek() - 1;
               int high = Math.min(height[i], height[st.peek()]) - height[top];
               answer += dist * high;
            }
            st.push(i);
        }
        return answer;
    }

    //using 2 pointer
    public static int waterTrappedIn(int[] height){
        int result = 0, left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        while(left < right){
            left_max = Math.max(left_max, height[left]);//4
            right_max = Math.max(right_max, height[right]);//5

            if(left_max < right_max) {
                result += left_max - height[left];//
                left++;
            }
            else {
                result += right_max - height[right];
                right--;
            }
        }
        return result;
    }
}
