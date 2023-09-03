package org.example.ky_5;
//https://www.codewars.com/kata/5270d0d18625160ada0000e4/java
public class Greed {
    public static int greedy(int[] dice){
        int[] counters = new int[6];
        int total = 0;
        for(int val: dice){
            counters[val-1] += 1;
        }
        for(int i=0; i<counters.length; i++){
            total += score(i+1, counters[i]);
        }
        return total;
    }

    private static int score(int value, int counter){
        if(counter == 0)
            return 0;
        int[] triples = new int[] {1000, 200, 300, 400, 500, 600};
        int[] ones = new int[]    { 100,   0,   0,   0,  50,   0};
        int base = 3;
        int remainder = counter % base;
        return (counter - remainder)/base * triples[value-1] + remainder * ones[value - 1];
    }
}
