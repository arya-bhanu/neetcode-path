package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr1 = {1,2,3,1};
        int [] arr2 = {1,2,3,4};
        int [] arr3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr1));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));
    }
//    use hashset
//    faster and more memory efficient
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(hs.contains(i)) return true;
            hs.add(i);
        }
        return false;
    }
}