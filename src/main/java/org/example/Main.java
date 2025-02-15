package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1,1,1,3,4}));
    }
//    naive approach
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
//        create tracker from array default value of false
        List<Integer> result = new LinkedList<>();
//        does this considered extra space?
        boolean [] tracker = new boolean[nums.length];
        for(Integer i: nums){
            tracker[i-1] = true;
        }
        for(int i = 1; i <= nums.length; i++){
            if(!tracker[i-1]){
                result.add(i);
            }
        }
        return result;
    }
}