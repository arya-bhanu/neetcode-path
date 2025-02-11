package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(maximumCount(new int[]{-2,-1,-1,1,2,3}));
//        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
        System.out.println(maximumCount(new int[]{0,0,0,0,0}));
    }
    public static int maximumCount(int[] nums) {
//        search for negative number
        int l = 0;
        int r = nums.length - 1;
        int neg = 0;
        while (l <= r){
            int m = (l + r) / 2;
            if(nums[m] >= 0){
                r = m - 1;
                continue;
            }
            if(nums[m] < 0){
                l = m + 1;
                neg = m + 1;
            }
        }

        l = neg;
        r = nums.length - 1;
        int pos = 0;
        System.out.println(neg);
//        search for positive number
        while (l <= r){
            int m = (l + r) / 2;
            if(nums[m] <= 0){
                l = m + 1;
                continue;
            }
            if(nums[m] > 0){
                pos = nums.length - m;
                r = m -1;
            }
        }
//        if(pos == 0) return 0;
        return Math.max(neg,nums.length - pos);
    }
}