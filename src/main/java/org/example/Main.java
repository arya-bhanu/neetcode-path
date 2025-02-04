package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
//    slower because using map, and iterate also in array
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            map.put(i, map.getOrDefault(i,0) + 1);
            int val = map.get(i);
            if(val > (nums.length / 2)){
                return i;
            }
        }
        return 0;
    }
}