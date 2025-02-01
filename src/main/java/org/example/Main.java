package org.example;

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
//        Creative ways, you can add two string and check if it contains
//        if it all about repetition, think about double it content
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}