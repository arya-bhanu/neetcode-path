package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
//        Actually, using regex is slower, use " " instead
        String [] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++){
            if(words[i].startsWith(searchWord)) return i + 1;
        }
        return -1;
    }
}