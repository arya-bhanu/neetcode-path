package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findSubarrays(new int[]{4,2,4}));
        System.out.println(findSubarrays(new int[]{1,2,3,4,5}));
        System.out.println(findSubarrays(new int[]{0,0,0}));
    }
    public static boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = i +1;
        while(j <= nums.length - 1){
            int sum = nums[i] + nums[j];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
            i++;
            j++;
        }
        return false;
    }
}