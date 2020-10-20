package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//    Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2Replace {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(rand.nextDouble() * 10000) / 100;
        }
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(array));

        System.out.print("Введите число Z: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Это не число! Введите число Z: ");
            sc.next();
        }
        double z = sc.nextDouble();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен: " + count);
    }
}
