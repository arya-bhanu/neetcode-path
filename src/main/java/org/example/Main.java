package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
//    faster way, we can use sorting
//    assume that all elements in array is only 2 digits type, for ex [1 & 2], [2 & 3], not [1,2,3] or [3,5,1,2]
//    in that case we can sort it, and take the middle elements of sorted array
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}