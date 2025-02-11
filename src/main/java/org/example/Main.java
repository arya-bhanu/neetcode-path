package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
        System.out.println(canConstruct("abxcc","characterbin"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer>  map = new HashMap<>();
        for(Character c: ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(Character c: magazine.toCharArray()){
            if(map.containsKey(c)){
                int val = map.get(c);
                if(val == 1) {
                    map.remove(c);
                    continue;
                }
                --val;
                map.put(c,val);
            }
        }
        return map.isEmpty();
    }
}