package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }
    public static int mySqrt(int x) {
        if(x == 0)  return 0;
        long l = 1;
        long r = x;
        int defaultX = -1;
        while (l <= r){
            long m = (l + r) / 2;
            if(x < m * m){
                r = m - 1;
                continue;
            }
            if(x > m * m){
                l = m + 1;
                defaultX = (int) m;
                continue;
            }
            if(x == m * m){
                defaultX = (int) m;
                break;
            }
        }
        return defaultX;
    }
}