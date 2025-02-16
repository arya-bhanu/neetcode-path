package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(heightChecker(new int[] {1,1,4,2,1,3}));
    }
    public static int heightChecker(int[] heights) {
        int counter = 0;
        int [] heightOriginal = heights.clone();
        Arrays.sort(heights);
        int i = 0;
        for(Integer j : heightOriginal){
            if (j != heights[i]) counter++;
            ++i;
        }
        return counter;
    }
}