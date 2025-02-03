package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String [] words1 = {"pay","attention","practice","attend"};
        String [] words2 = {"leetcode","win","loops","success"};
        String pref1 = "at";
        String pref2 = "code";
        System.out.println(prefixCount(words1, pref1));
        System.out.println(prefixCount(words2, pref2));
    }
    public static int prefixCount(String[] words, String pref) {
        int counter = 0;
        for(String str: words){
            if(str.length() < pref.length()) continue;
            if(str.startsWith(pref)) counter++;
        }
        return counter;
    }
}