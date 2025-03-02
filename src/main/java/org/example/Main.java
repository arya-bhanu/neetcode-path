package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }
    public static  String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for(int i = 0; i < max; i++){
            if(i < word1.length()){
                word.append(word1.charAt(i));
            }
            if(i < word2.length()){
                word.append(word2.charAt(i));
            }
        }
        return word.toString();
    }
}