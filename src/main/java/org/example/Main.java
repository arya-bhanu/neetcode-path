package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("dddccdbba"));
        System.out.println(firstUniqChar("z"));
    }
    public static int firstUniqChar(String s) {
        Set<Character> set = new HashSet<>();
        Queue<Character> q = new LinkedList<>();
        for(Character c: s.toCharArray()){
            q.add(c);
        }
        int iterate = 0;
        while (!q.isEmpty()){
            char compare = q.poll();
            if(set.contains(compare)) {
                iterate++;
                continue;
            };
            if(q.isEmpty() && !set.contains(compare)) return iterate;
            int j = 0;
            for(Character c : q){
                if(c == compare) {
                    set.add(c);
                    break;
                }
                if(j == q.size() - 1) return iterate;
                j++;
            }
            ++iterate;
        }
        return -1;
    }
}