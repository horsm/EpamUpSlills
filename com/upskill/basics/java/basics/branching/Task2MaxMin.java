package com.upskill.basics.java.basics.branching;

// 2. Найти max{min(a, b), min(c, d)}.

public class Task2MaxMin {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 6;

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
