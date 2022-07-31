package com.prac;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Comcast {

    public Comcast(){

    }
    Map<Integer, String> table = new HashMap<>();
    static Map<Integer, String> cache = new LinkedHashMap<>();
    int cacheCapacity = 15;
    public static void main(String[] args) {
        Comcast obj = new Comcast();
        obj.getProductName(2);
    }

    public String getProductName(Integer id) {
        try{
            if(cache.get(id) == null) {
                if (table.containsKey(id)) {
                    if (cache.size() > cacheCapacity) {
                        cache.remove(cache.entrySet().iterator().next().getKey());
                    }
                    cache.put(id, table.get(id));
                }
            }
            return cache.get(id);
        }
        catch (Exception e){
            String m = e.getMessage();
            return m;
        }
    }
}
