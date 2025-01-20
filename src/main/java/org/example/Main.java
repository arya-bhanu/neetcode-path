package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr1 = new int[] {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void moveZeroes(int [] nums){
        if(nums.length == 1){
            return;
        }
        int k = 0;
        for(int i = k; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                ++k;
            }
        }
        for(int j = k; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}