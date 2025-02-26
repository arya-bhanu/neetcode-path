package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] newArr = new int[2*nums.length];
        int i = 0;
        int j = nums.length;
        for(int val: nums){
            newArr[i] = val;
            newArr[j] = val;
            ++j;
            ++i;
        }
        return newArr;
    }
}