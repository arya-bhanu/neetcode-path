package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(generate(6));
    }
//    0(n^2)
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(1)));
        if(numRows == 1) return triangle;
        triangle.add(new ArrayList<>(List.of(1,1)));
        if(numRows == 2) return triangle;
        for(int i = 2; i < numRows; i++){
            List <Integer> result = new ArrayList<>();
            result.addFirst(1);
            List<Integer> preArr = triangle.get(i-1);
            for(int j = 1; j < preArr.size();j++){
                result.add(j,preArr.get(j-1) + preArr.get(j));
            }
            result.addLast(1);
            triangle.add(i,result);
        }
        return triangle;
    }
}