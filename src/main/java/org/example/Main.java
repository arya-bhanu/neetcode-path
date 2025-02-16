package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(findPoisonedDuration(new int[]{1,4},2));
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
        System.out.println(findPoisonedDuration(new int[]{2,3,5,6},4));
        System.out.println(findPoisonedDuration(new int[]{2,7,8,10,11},4));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisoned = 0;
        int i = 0;
        while (i < timeSeries.length){
            if(i == timeSeries.length - 1){
                totalPoisoned += duration;
            }else{
                int valL = timeSeries[i];
                int valR = timeSeries[i + 1];
                int countTime = valL + duration - 1;
                if(countTime < valR){
                    totalPoisoned += countTime - valL + 1;
                }else{
                    totalPoisoned += valR - valL;
                }
            }
            ++i;
        }
        return totalPoisoned;
    }
}