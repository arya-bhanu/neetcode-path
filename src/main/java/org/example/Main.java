package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
//    manual checking for other 3 rows
    public static String[] findWords(String[] words) {
        List<String> result = new LinkedList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        for(String s : words){
            if(checkIsExist(s.toLowerCase(),first) || checkIsExist(s.toLowerCase(),second) || checkIsExist(s.toLowerCase(), third)){
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
    public static boolean checkIsExist(String search, String row){
        for(Character c  : search.toCharArray()){
            if(row.indexOf(c) == -1) return false;
        }
        return true;
    }
}