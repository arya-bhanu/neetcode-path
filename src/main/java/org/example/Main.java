package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] nums1 = new int[] {2,7,11,15};
        int [] nums2 = new int[] {3,2,4};
        int [] nums3 = new int[] {3,3};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        System.out.println(Arrays.toString(twoSum(nums3, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for (int i = 1; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}