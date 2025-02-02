package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n1 = 3;

        int[] nums1b = new int[]{1};
        int m1b = 1;
        int[] nums2b = new int[]{};
        int n1b = 0;

        int[] nums1c = new int[]{0};
        int m1c = 0;
        int[] nums2c = new int[]{1};
        int n1c = 1;

        merge(nums1, m1, nums2, n1);
        merge(nums1b, m1b, nums2b, n1b);
        merge(nums1c, m1c, nums2c, n1c);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums1b));
        System.out.println(Arrays.toString(nums1c));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int iterate = m + n;
        int pnums2 = n - 1;
        int pnums1 = m - 1;
        for (int i = iterate - 1; i >= 0; i--) {
            if (pnums2 < 0) {
                return;
            }
            if (pnums1 < 0) {
                nums1[i] = nums2[pnums2];
                --pnums2;
                continue;
            }

            int val2 = nums2[pnums2];
            int val1 = nums1[pnums1];
            if (val2 > val1) {
                nums1[i] = val2;
                --pnums2;
            } else {
                nums1[i] = val1;
                --pnums1;
            }
        }
    }
}