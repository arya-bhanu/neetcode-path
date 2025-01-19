package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s1 = "MCMXCIV";
        System.out.println(romanToInt(s1));
    }
    public static int romanToInt(String s) {
        int total = 0;
        Map <Character, Integer> symb = new HashMap<>();
        symb.put('I',1);
        symb.put('V',5);
        symb.put('X',10);
        symb.put('L',50);
        symb.put('C',100);
        symb.put('D',500);
        symb.put('M',1000);
        int length = s.length();
        int l = 0;
        int r = l + 1;
        while (r <= length){
            Integer valL = symb.get(s.charAt(l));

            if(r == length){
                total += valL;
                return total;
            }
            Integer valR = symb.get(s.charAt(r));
            if (valL >= valR){
                total += valL;
                ++l;
                ++r;
            }else{
                total += (valR - valL);
                l = r + 1;
                r = l + 1;
            }
        }
        return total;
    }
}