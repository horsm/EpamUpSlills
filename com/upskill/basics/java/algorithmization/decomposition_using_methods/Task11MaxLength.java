package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11MaxLength {
    public static void main(String[] args) {
        long a = 1234222222;
        long b = 24435245;

        System.out.println(findMaxLength(a, b));
    }

    private static long findMaxLength(double a, double b) {
        return (long) (((Math.log10(a) + 1)) > ((Math.log10(b) + 1)) ? a : b);
    }
}
