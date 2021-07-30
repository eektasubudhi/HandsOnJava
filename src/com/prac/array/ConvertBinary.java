package com.prac.array;

import java.util.Stack;

public class ConvertBinary {

    public static void main(String[] args) {
        //System.out.println(3%4);
        ConvertBinary cb = new ConvertBinary();
        String finalResult = cb.getBinarySum(12,2);
        System.out.println(finalResult);
    }
    public String getBinarySum(int num,int sum){
        ConvertBinary cb1 = new ConvertBinary();
        Stack<String> st = new Stack<>();
        cb1.binaryConverted(12,st);
        StringBuilder sb = new StringBuilder();
        System.out.println(st);
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
     /*   String digit = sb.toString().substring(sb.toString().length()-2);
        System.out.println(digit);
        int lst = sum+ Integer.parseInt(digit);
        System.out.println(lst);
        sb.replace(sb.toString().length()-2,sb.toString().length(),String.valueOf(lst));*/
        //sb.toString().substring(0,sb.toString().length()-1)+String.valueOf(lst);
        return sb.append(String.valueOf(sum)).toString();
    }
    public void binaryConverted(int num, Stack<String> st){
        if(num == 1) {
            st.push("1");
            return;
        }
        if(num%2 == 0) st.push("0");
        else st.push("1");
        binaryConverted(num/2,st);
    }

}
