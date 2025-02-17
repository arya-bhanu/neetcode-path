package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }
//    naive way
    public static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        Set<Character> set = new HashSet<>();
        for(Character c: allowed.toCharArray()){
            set.add(c);
        }
        for(String word: words){
            boolean notSame = false;
            for(Character c: word.toCharArray()){
                if(!set.contains(c)) {
                    notSame = true;
                    break;
                }
            }
            if(notSame)continue;
            counter++;
        }
        return counter;
    }
}