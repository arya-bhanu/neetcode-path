package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("dddccdbba"));
        System.out.println(firstUniqChar("z"));
    }
//    From others solution, only use primitive array
    public static int firstUniqChar(String s) {
//        create store for 26 alphabet in integer value for counter
        int [] storeArr = new int[26];
        for(char c: s.toCharArray()){
//            char a starts from 97 in ASCII
            int indexLoc = c - 'a';
//            increase the count of character
            storeArr[indexLoc]++;
        }

//        loop again for checking
        int iterator = 0;
        for(char c : s.toCharArray()){
            int indexLoc = c - 'a';
//            it must be present at least 1 from previous iterator, if it more than 1, it present multiple times
            if(storeArr[indexLoc] == 1) return iterator;
            iterator++;
        }
        return -1;
    }
}