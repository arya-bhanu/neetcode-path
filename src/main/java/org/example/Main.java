package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s1 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String s2 = "ccc";
        String s3 = "bananas";
        System.out.println(longestPalindrome(s1));
//        System.out.println(longestPalindrome(s2));
//        System.out.println(longestPalindrome(s3));
    }
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        boolean hasOdd = false;
        int counter = 0;
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(var mapVal : map.entrySet()){
            if(mapVal.getValue() % 2 == 0){
                counter += mapVal.getValue();
                continue;
            }
            hasOdd = true;
            if(mapVal.getValue() > 2){
                counter += mapVal.getValue() - 1;
            }
        }
        if(hasOdd) counter++;
        return counter;
    }
}