package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkDistances("abaccb",new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(checkDistances("aa",new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }
//    Character actually have some int value (number) value
    public static boolean checkDistances(String s, int[] distanceArr) {
        Map<Character, Integer> distance = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!distance.containsKey(s.charAt(i))){
                distance.put(s.charAt(i),i);
            }else{
                int start = distance.get(s.charAt(i));
                int dist = i - start - 1;
//                check and access array using converted character index
                if(distanceArr[s.charAt(i) - 'a'] != dist) return false;
            }
        }
        return true;
    }

}