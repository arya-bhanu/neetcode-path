package org.example;

public class Main {
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s1));
        System.out.println(repeatedSubstringPattern(s2));
        System.out.println(repeatedSubstringPattern(s3));
    }
//    append and compare string
    public static boolean repeatedSubstringPattern(String s) {

        int length = s.length();
        for (int i = 1; i <= length / 2; i++){
            if(length % i == 0){
                String subs = s.substring(0,i);
                for (int j = 1; j <= length/ i - 1; j++){
                    int start = j * i;
                    String subS = s.substring(start, start + i);
                    if(!subS.equals(subs)){
                        break;
                    }
                    if(length == start + i) return true;
                }
            }
        }

        return false;
    }
}