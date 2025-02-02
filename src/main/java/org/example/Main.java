package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc","ab"));
        System.out.println(maxRepeating("ababc","ba"));
        System.out.println(maxRepeating("ababc","ac"));
    }
    public static int maxRepeating(String sequence, String word) {
        if(!sequence.contains(word)) return 0;
        int targetLength = word.length();
        char fc = word.charAt(0);
        int counter = 0;
        int i = 0;
        int j = i + targetLength - 1;
        while (j < sequence.length()){
            if(sequence.charAt(i) == fc){
                String str = sequence.substring(i, j + 1);
                if(str.equals(word)) counter++;
            }
            ++i;
            j = i + targetLength - 1;
        }
        return counter;
    }
}