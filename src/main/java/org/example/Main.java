package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkDistances("abaccb",new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(checkDistances("aa",new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }
    public static boolean checkDistances(String s, int[] distanceArr) {
        Map<Character, Integer> mapAlpha = getCharacterIntegerMap();
        Map<Character, Integer> distance = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!distance.containsKey(s.charAt(i))){
                distance.put(s.charAt(i),i);
            }else{
                int start = distance.get(s.charAt(i));
                int dist = i - start - 1;
                distance.put(s.charAt(i),dist);
            }
        }
        for(var entry: distance.entrySet()){
            int valAlpha = mapAlpha.get(entry.getKey());
            int valDistance = distance.get(entry.getKey());
            if(distanceArr[valAlpha] != valDistance) return false;
        }
        return true;
    }

    private static Map<Character, Integer> getCharacterIntegerMap() {
        Map<Character, Integer> mapAlpha = new HashMap<>();
        mapAlpha.put('a', 0);
        mapAlpha.put('b', 1);
        mapAlpha.put('c', 2);
        mapAlpha.put('d', 3);
        mapAlpha.put('e', 4);
        mapAlpha.put('f', 5);
        mapAlpha.put('g', 6);
        mapAlpha.put('h', 7);
        mapAlpha.put('i', 8);
        mapAlpha.put('j', 9);
        mapAlpha.put('k', 10);
        mapAlpha.put('l', 11);
        mapAlpha.put('m', 12);
        mapAlpha.put('n', 13);
        mapAlpha.put('o', 14);
        mapAlpha.put('p', 15);
        mapAlpha.put('q', 16);
        mapAlpha.put('r', 17);
        mapAlpha.put('s', 18);
        mapAlpha.put('t', 19);
        mapAlpha.put('u', 20);
        mapAlpha.put('v', 21);
        mapAlpha.put('w', 22);
        mapAlpha.put('x', 23);
        mapAlpha.put('y', 24);
        mapAlpha.put('z', 25);
        return mapAlpha;
    }
}