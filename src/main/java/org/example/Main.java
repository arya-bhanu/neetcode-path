package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2,4,5,5,5,3,1,1,10}));
        System.out.println(singleNumber(new int[] {1}));
        System.out.println(singleNumber(new int[] {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354}));
    }
//    naive method
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Integer nonDuplicate = null;
        Set<Integer> set = new HashSet<>();
        for(Integer i: nums){
            if(set.contains(i) && i.equals(nonDuplicate)){
                nonDuplicate = null;
            }else if(nonDuplicate == null){
                nonDuplicate = i;
            }
            set.add(i);
        }
        return nonDuplicate == null ? -1 : nonDuplicate;
    }
}