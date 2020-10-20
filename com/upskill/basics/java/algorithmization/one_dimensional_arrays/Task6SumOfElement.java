package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 6. Задана последовательность N вещественных чисел.
//    Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        double[] array = new double[n];
      //  double[] array = {10,20,30};

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(rand.nextDouble() * 10000 - 5000) / 100;
        }
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(array));

        double count = 0;
        for (int i = 2; i < array.length + 1; i++) {
            if (checkNum(i)) {
                count += array[i-1];
            }
        }
        System.out.println("Сумма = " + count);
    }

    static boolean checkNum(int m) {
        for (int j = 2; j < m; j++) {
            if (m % j == 0) {
                return false;
            }
        }
        return true;
    }
}
