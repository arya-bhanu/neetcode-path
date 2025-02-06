package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"abab","ab"}));
    }
    public static boolean isPrefixSuffix(String str1, String str2){
        if(str2.length() < str1.length()) return false;
        String prefix = str2.substring(0,str1.length());
        String suffix = str2.substring(str2.length() - str1.length());
        return prefix.equals(str1) && suffix.equals(str1);
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int counter = 0;
        int i = 0;
        int j = 1;
        while (i < j && j < words.length){
            while (j < words.length){
                if(isPrefixSuffix(words[i],words[j])) counter++;
                ++j;
            }
            ++i;
            j = i + 1;
        }
        return counter;
    }
}