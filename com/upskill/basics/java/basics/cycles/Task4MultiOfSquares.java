package com.upskill.basics.java.basics.cycles;

// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4MultiOfSquares {
    public static void main(String[] args) {
        int n = 200;

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(result.toString());
    }
}
