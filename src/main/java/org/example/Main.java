package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(missingNumber(new int[] {3,0,1}));
        System.out.println(missingNumber(new int[] {0,1}));
        System.out.println(missingNumber(new int[] {1,2,3,5,0}));
    }
//    sum distinct approach
//    only use one iteration
//    memory efficient
    public static int missingNumber(int[] nums) {
        int shouldSum = 0;
        int currSum = 0;
        for(int i = 0; i < nums.length + 1; i++){
            shouldSum += i;
            if(i != nums.length){
                currSum += nums[i];
            }
        }
        return shouldSum - currSum;
    }
}