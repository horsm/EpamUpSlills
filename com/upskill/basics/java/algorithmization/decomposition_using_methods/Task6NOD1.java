package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6NOD1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = 16;

        if (nod(nod(a, b), c) == 1) {
            System.out.println("Числа: " + a + " " + b + " " + c + " взаимно простые");
        } else {
            System.out.println("Числа: " + a + " " + b + " " + c + " не взаимно простые");
        }
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
