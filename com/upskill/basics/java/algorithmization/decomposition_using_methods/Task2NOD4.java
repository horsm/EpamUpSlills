package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2NOD4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int c = 18;
        int d = 81;

        System.out.println("НОД(" + a + ", " + b + ", " + c + ", " + d + ") = "
                            + nod(nod(a, b), nod(c, d)));
    }

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
