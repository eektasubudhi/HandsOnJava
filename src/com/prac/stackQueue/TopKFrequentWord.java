package com.prac.stackQueue;

import java.util.*;

public class TopKFrequentWord {
    public static void main(String[] args) {
        String[] input = {"i","love","leetcode","i","love","coding"};
        int k = 2; // find most 2 frequent word from the list

        TopKFrequentWord ob = new TopKFrequentWord();
        List<String> output = ob.getMostFrequentWords(input, k);
        System.out.println(output);
    }
    public List<String> getMostFrequentWords(String[] words, int k){
        List<String> output = new ArrayList<>();
        //if(words.length == 0) return output;
        if(words.length < k) return Arrays.asList(words);

        HashMap<String, Integer> wordMap = new HashMap<>();

        for(String s: words) wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);

        PriorityQueue<WordPair> wordQueue = new PriorityQueue<>(new Comparator<WordPair>() {
            public int compare(WordPair o1, WordPair o2) {
                if(o1.frequency == o2.frequency) return o1.word.compareTo(o2.word);
                else return o2.frequency - o1.frequency;
            }
        });
        for(Map.Entry<String, Integer> en : wordMap.entrySet()){
            wordQueue.add(new WordPair(en.getValue(),en.getKey()));
        }
        for(int i = 0; i < k ; i++){
            output.add(wordQueue.poll().word);
        }
        return output;
    }
    class WordPair {
        int frequency;
        String word;

        WordPair(int freq, String wrd){
            this.frequency = freq;
            this.word = wrd;
        }
    }
}
