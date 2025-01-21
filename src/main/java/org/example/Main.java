package org.example;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,3,5,6,10,20};
        int target1 = 6;
        int target2 = 2;
        int target3 = 7;
        int target4 = 4;
        System.out.println(searchInsert(arr1, target4));
        System.out.println(Math.floorDiv(1,2));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = Math.floorDiv(l + r, 2);
        // kondisi while ini dapat berfungsi jika r < l, situasi r < l dapat terjadi menandakan bahwa elemen pasti tidak ada, karena
        // saat l < x < r, namun x tidak ada, maka kondisi l > r atau l = r dapat terjadi karena penukaran (overlapping).
        while(l <= r){
            if(nums[m] == target) return m;
            if(nums[m] < target){
                l = m + 1;
                m = Math.floorDiv(l + r,2);
            }else if(nums[m] > target){
                r = m - 1;
                m = Math.floorDiv(l + r, 2);
            }
        }
        return r + 1;
    }
}