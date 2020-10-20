package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 1. Написать метод(методы) для нахождения наибольшего общего делителя
//    и наименьшего общего кратного двух натуральных чисел:

public class Task1NOD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println("НОД(" + a + ", " + b + ") = " + nod(a, b));
        System.out.println("НОК(" + a + ", " + b + ") = " + nok(a, b));
    }

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static int nok(int a, int b) {
        return a * b / nod(a, b);
    }
}
