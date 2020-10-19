package com.upskill.basics.java.basics.cycles;

public class Task3SumOfSquares {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100 ; i++) {
            count+= i*i;
        }

        System.out.println(count);
    }
}
