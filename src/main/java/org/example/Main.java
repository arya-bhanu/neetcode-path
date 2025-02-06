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
//        String.copyValueOf can be time consuming
//        use new String()
        return new String(newArr);
    }

    public static boolean isVowels(char c){
        return "AIUEOaiueo".indexOf(c) != -1;
    }
}