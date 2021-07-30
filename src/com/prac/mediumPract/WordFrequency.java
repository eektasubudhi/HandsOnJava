package com.prac.mediumPract;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args){
        WordFrequency object = new WordFrequency();
        String book = "Once there was a girl, whose name was Eekta. The girl was fair and tall. She was very kind hearted and humble. " +
                "The girl had a constant aim to succeed in her career by getting a good job in a big company. Finally she " +
                "got what she wanted. Then the girl got married and lived happily forever.";
        //String book = "Hello girl. The girl the fat. The girl is fat";
        String word = "girl";
        int resultCount = object.frequencyOfTheWord(book, word);
        System.out.println("Frequency : "+resultCount);

        //boolean res = haveOnlyAlphabets(book);
        System.out.println("Result of is alphabets Only : "+object.haveOnlyAlphabets(book));
    }
    public int frequencyOfTheWord(String book, String word){
        String[] bookArr = book.split(" ");
        //for (String s : bookArr) System.out.println(s);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < bookArr.length; i++){
            if(bookArr[i].endsWith(".") || bookArr[i].endsWith(",")) bookArr[i] = bookArr[i].substring(0,bookArr[i].length()-1);
            map.put(bookArr[i].toLowerCase(), map.getOrDefault(bookArr[i].toLowerCase(),0)+1);
        }
        map.forEach((k, v)-> System.out.println(k+" "+v));
        return map.get(word);
    }
    public boolean haveOnlyAlphabets(String book){
        //String[] bookArr = book.split(" ");
        boolean flag = false;
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        for(int i = 0; i < book.length(); i++){
            int val = Character.getNumericValue(Character.toLowerCase(book.charAt(i)));
            if(a <= val && val <= z) flag = true;
            else if (book.charAt(i) == ' ') flag = true;
            else {
                flag = false;
                return flag;
            }
        }

        return flag;
    }
}
