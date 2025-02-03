package org.example;

import java.util.HashMap;
import java.util.Map;

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
//    use hashmap
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i :nums){
            int val = map.getOrDefault(i,1);
            if(val > 1) return true;
            map.put(i, ++val);
        }
        return false;
    }
}