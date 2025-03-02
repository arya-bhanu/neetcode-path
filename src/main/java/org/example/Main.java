package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(gcd(10, 45));
        System.out.println(gcd(6,12));
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABCDEF","ABC"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        int gcdNum = gcd(str1.length(),str2.length());
        String subs = str1.substring(0,gcdNum);
        String repeatedStr1 = subs.repeat(str1.length() / subs.length());
        String repeatedStr2 = subs.repeat(str2.length() / subs.length());
        return repeatedStr1.equals(str1) && repeatedStr2.equals(str2) ? subs : "";
    }

    public static int gcd(int a, int b){
        int n = Math.max(a,b);
        int divider = Math.min(a,b);
        while (n % divider != 0){
            int temp = divider;
            divider = n % divider;
            n = temp;
        }
        return divider;
    }
}