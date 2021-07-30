package com.prac.mediumPract;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
        int capacity;
        Map<Integer, Integer> hmap = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            int value = -1;
            if(hmap.containsKey(key)){
                value = hmap.get(key);
                hmap.remove(key);
                hmap.put(key,value);
            }
            return value;
        }

        public void put(int key, int value) {
            if(hmap.size() < capacity){
                hmap.put(key,value);
            }else if(hmap.containsKey(key)){
                hmap.put(key,value);
            }else{
                hmap.remove(hmap.entrySet().iterator().next().getKey());
                hmap.put(key,value);
            }
        }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
