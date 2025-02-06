package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setTemp = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(Integer i: nums1){
            setTemp.add(i);
        }
        for(Integer i: nums2){
            if((setTemp.contains(i))){
                result.add(i);
            }
        }
        int[] ans = new int[result.size()];
        int index = 0;
        for(Integer i :result){
            ans[index]  = i;
            index++;
        }
        return ans;
    }
}