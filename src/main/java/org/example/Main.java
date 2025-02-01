package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String  s1 = "abcde";
        String goal1 = "abcde";
        String s2= "abcde";
        String goal2 = "abced";
        System.out.println(rotateString(s1,goal1));
        System.out.println(rotateString(s2,goal2));
    }
    public static boolean rotateString(String s, String goal) {
//        Using Queue (not very effective)
        if (s.length() != goal.length()) return false;
        Queue<Character> pq = new LinkedList<>();
        for (Character c: s.toCharArray()){
            pq.add(c);
        }
        for (int i = 0; i < s.length(); i++){
            pq.add(pq.poll());
            StringBuilder sb = new StringBuilder();
            for (Character character : pq) {
                sb.append(character);
            }
            if(sb.toString().equals(goal)) return true;
        }
        return false;

    }
}