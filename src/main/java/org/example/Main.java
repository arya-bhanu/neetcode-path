package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] arr2 = new int[]{1,1,2};
        int length = sol.removeDuplicates(arr1);
        int length2 = sol.removeDuplicates(arr2);
        System.out.println(length);
        System.out.println(length2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = k; i < nums.length; i++){
           if(nums[i] != nums[i-1]){
               nums[k] = nums[i];
               ++k;
           }
       }
        return k;
    }
}