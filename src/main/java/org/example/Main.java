package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));
    }
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            int m = (l + r) / 2;
            if(nums[m] < target){
                l = m + 1;
                continue;
            }
            if(nums[m] > target){
                r = m - 1;
                continue;
            }
            if(nums[m] == target){
                return m;
            }
        }
        return -1;
    }
}