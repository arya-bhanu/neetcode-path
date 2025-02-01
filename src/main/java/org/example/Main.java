package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String [] ex1 = new String[]{"mass","as","hero","superhero"};
        System.out.println(stringMatching(ex1));
    }
//    brute force
    public static List<String> stringMatching(String[] words) {
        List<String> result = new LinkedList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0;  j < words.length; j++){
                if(words[j].length() <= words[i].length()){
                    continue;
                }
                if(words[j].contains(words[i])){
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}