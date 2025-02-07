package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
        System.out.println(Arrays.toString(intersect(new int[]{1,2}, new int[]{1,1})));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                intersect.add(nums1[i]);
                ++i;
                ++j;
                continue;
            }
            if(nums1[i] < nums2[j]){
                ++i;
            }else{
                ++j;
            }
        }

        int [] ans = new int[intersect.size()];
        int iterate = 0;
        for(Integer val: intersect){
            ans[iterate] = val;
            iterate++;
        }
        return ans;
    }
}