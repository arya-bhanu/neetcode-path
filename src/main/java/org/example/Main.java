package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr1 = new int[] {0,1,0,3,12};
        int[] arr2 = new int[] {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));
        moveZeroes2(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    // your own algorithm
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

    // algorithm with swapping
    public static void moveZeroes2(int [] nums){
        if(nums.length == 1){
            return;
        }
        int k = 0;
        for(int i = k; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                ++k;
            }
        }
    }

}