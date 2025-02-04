package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(missingNumber(new int[] {3,0,1}));
        System.out.println(missingNumber(new int[] {0,1}));
        System.out.println(missingNumber(new int[] {1,2,3,5,0}));
    }
//    naive approach
    public static int missingNumber(int[] nums) {
        int range = nums.length + 1;
        Arrays.sort(nums);
        for(int i = 0; i < range; i++){
            if(nums.length <= i) return nums[nums.length - 1] + 1;
            if(nums[i] != i) return i;
        }
        return -1;
    }
}