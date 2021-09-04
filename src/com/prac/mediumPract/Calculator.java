package com.prac.mediumPract;

import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        String calculate  = "2*3+5/6*3+15";

        Calculator cl = new Calculator();
        int result = cl.calculateTheString(calculate);
        System.out.println("Calculated as : " + result);
    }
    public int calculateTheString(String calculate){
        int sum = 0;
        Stack<Integer> st = new Stack();
        StringBuilder sd = new StringBuilder();
        char currentOperator = '+';
        for(int i = 0; i < calculate.length(); i++){ //2*3+5/6*3+15
            if(Character.isDigit(calculate.charAt(i))){
                sd.append(calculate.charAt(i));
            }
            if(calculate.charAt(i) != ' ' && !Character.isDigit(calculate.charAt(i)) || i == calculate.length() - 1){
                if(currentOperator == '/'){
                    st.push(st.pop()/Integer.valueOf(sd.toString()));
                }
                else if(currentOperator == '*'){
                    st.push(st.pop()*Integer.valueOf(sd.toString()));
                }
                else if(currentOperator == '+'){
                    st.push(Integer.valueOf(sd.toString()));
                }
                else if(currentOperator == '-'){
                    st.push(-Integer.valueOf(sd.toString()));
                }
                sd = new StringBuilder();
                currentOperator = calculate.charAt(i);
            }
        }
        while (!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
