package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] ex1 = new int[] {1,2,3};
        int [] ex2 = new int[] {9};
        int [] ex3 = new int[] {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(ex1)));
        System.out.println(Arrays.toString(plusOne(ex2)));
        System.out.println(Arrays.toString(plusOne(ex3)));
    }
//    do not use copy array into another memory array. we can create a new size from same memory
//    this algorithm is fixed with simpler flow
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1;i >= 0;i--){
            int val = digits[i];
            if(val < 9){
                digits[i] = ++val;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}