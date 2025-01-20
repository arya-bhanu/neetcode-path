package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr1 = new int[] {0,1,2,2,3,0,4,2};
        int val1 = 2;
        System.out.println(new Solution().removeElement(arr1,val1));
        System.out.println(Arrays.toString(arr1));
    }
}

class Solution{
    public int removeElement (int [] arr, int val){
        int k = 0;
        for(int i = k; i < arr.length; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                ++k;
            }
        }
        return k;
    }
}