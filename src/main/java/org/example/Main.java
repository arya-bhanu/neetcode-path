package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(isHappy(3));
        System.out.println(sumOfSquares(81));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        int val = n;
        while (!hs.contains(val)){
            hs.add(val);
            val = sumOfSquares(val);
            System.out.println(hs);
            System.out.println(val);
            if(val == 1) return true;
        }
        System.out.println(hs);
        return false;
    }
    public static int sumOfSquares(int n){
        int value = 0;
        while(n != 0){
            int sqFirst = (int) Math.pow(n % 10,2);
            n = n / 10;
            value += sqFirst;
        }
        return value;
    }
}