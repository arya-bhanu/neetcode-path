package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] test1 = new int[] {1,2,2,1,1,0};
        int [] test2 = new int[] {0,1};

        System.out.println(Arrays.toString(applyOperations(test1)));
        System.out.println(Arrays.toString(applyOperations(test2)));
    }
    public static int[] applyOperations(int[] nums) {
        // process 1
        int j = 0;
        for(int i = j + 1; i < nums.length; i++){
            if(nums[j] == nums[i]){
                nums[j] = nums[j] * 2;
                nums[i] = 0;
            }
            ++j;
        }

        // process 2
        j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                ++j;
            }
        }
        return nums;
    }
}