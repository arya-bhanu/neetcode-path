package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(countPairs(new LinkedList<>(Arrays.asList(-1, 1, 2, 3, 1)),2));
        System.out.println(countPairs(new LinkedList<>(Arrays.asList(-6,2,5,-2,-7,-1,3)),-2));
    }
    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int counter = 0;

        int i = 0;
        while (i < nums.size() - 1){
            int j = i + 1;
            int numCheck = nums.get(i) + nums.get(j);
            if(numCheck >= target) break;
            while(j < nums.size()){
                int sum = nums.get(i) + nums.get(j);
                if(sum < target){
                    counter++;
                }else{
                    break;
                }
                j++;
            }
            i++;
        }
        return counter;
    }
}