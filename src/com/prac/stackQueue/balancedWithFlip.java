package com.prac.stackQueue;

import java.util.Stack;

public class balancedWithFlip {
    public static void main(String[] args) {
        String input = "}}}{}{{{";//"}}}}{}";
        // {{{} -> 1  }}{{  //{{{{ } //}}}  // { } // }{ // }}{{ // }}}{}{{{
        int cnt = isBalanced(input);
        System.out.println(cnt);
    }
    public static int isBalanced(String input){
        int counter = 0;
        int oppCou = 0;
        for (char c : input.toCharArray()){
            if(c == '{') counter++;
            else if (c == '}' && counter > 0) counter--;
            else oppCou++;
        }
        if(oppCou%2 == 0 && counter % 2 == 0) return oppCou/2 + counter/2;
        if (counter % 2 == 0 && oppCou == 0) return counter/2;

        return -1;
    }
}
