package org.example;

public class Main {
    public static void main(String[] args) {
        String [] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        String [] words2 = {"a","a"};
        String s2 = "aa";
        System.out.println(countPrefixes(words,s));
        System.out.println(countPrefixes(words2,s2));
    }
    public static int countPrefixes(String[] words, String s) {
        int counter = 0;
        for(String str: words){
            if(s.startsWith(str)) counter++;
        }
        return counter;
    }
}