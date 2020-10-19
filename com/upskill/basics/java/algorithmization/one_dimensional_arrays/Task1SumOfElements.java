package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1SumOfElements {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();
        // опредение числа K:
        System.out.print("Введите число K: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число K: ");
            sc.next();
        }
        int k = sc.nextInt();
        int count = 0;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % k == 0) {
                count += array[i];
            }
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма элементов, которые кратны К = " + count);
    }

}
