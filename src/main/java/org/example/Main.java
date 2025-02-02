package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc","ab"));
        System.out.println(maxRepeating("ababc","ba"));
        System.out.println(maxRepeating("ababc","ac"));
    }
//     if word concatenated k times is a substring of sequence
//    solved (simple)
    public static int maxRepeating(String sequence, String word) {
        if(!sequence.contains(word)) return 0;
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        stringBuilder.append(word);
        while (sequence.contains(stringBuilder)){
            counter++;
            stringBuilder.append(word);
        }
        return counter;
    }
}