package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7SumFactorial {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum = sum + factorial(i);
            }
        }
        System.out.println("Факториал = " + sum);

    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
