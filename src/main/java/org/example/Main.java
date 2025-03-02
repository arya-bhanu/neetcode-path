package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findGCD(new int[]{2,5,6,9,10}));
        System.out.println(findGCD(new int[]{7,5,6,8,3}));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        while (max % min != 0){
            int temp = max % min;
            max = min;
            min = temp;
        }
        return min;
    }

}