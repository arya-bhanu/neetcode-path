package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        String haystack3 = "hello";
        String needle3 = "ll";
        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
    }

// Efficient Solution, My Own Solution, 100% beats the others
    public static int strStr(String haystack, String needle) {
        int lengthHay = haystack.length();
        int lengthNeed = needle.length();
        int result = -1;
        for(int i = 0; i <= lengthHay - lengthNeed; i++){
            for (int j = 0; j < lengthNeed;j++){
                if(needle.charAt(j) != haystack.charAt(j + i)){
                    break;
                }
                if(j == lengthNeed - 1){
                    return i;
                }
            }
        }
        return result;
    }
}