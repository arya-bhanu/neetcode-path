package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s1 = "IceCreAm";
        String s2 = "leetcode";
        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
    }
    public static String reverseVowels(String s) {
        char [] newArr = s.toCharArray();
        int i = 0;
        int j = s.length() -  1;
        while (i < j){
            if(isVowels(s.charAt(i)) && isVowels(s.charAt(j))){
                newArr[i] = s.charAt(j);
                newArr[j] = s.charAt(i);
                ++i;
                --j;
                continue;
            }
            if(isVowels(s.charAt(i))){
                --j;
                continue;
            }
            if(isVowels(s.charAt(j))){
                ++i;
                continue;
            }
            --j;
            ++i;
        }
        return String.copyValueOf(newArr);
    }

    public static boolean isVowels(char c){
        return Character.toLowerCase(c) == 'a' || Character.toLowerCase(c)  == 'i' || Character.toLowerCase(c)  == 'u' || Character.toLowerCase(c)  == 'e' || Character.toLowerCase(c) == 'o';
    }
}