package com.upskill.basics.java.algorithmization.decomposition_using_methods;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8SumMassiv {
    static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива больше 3: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));

        // Вариант 1
        for (int i = 0; i < array.length - 2; i++) {
            System.out.println("a[" + i + "] + 2 следующих элемента = " + sumElentov(i, array));
        }

        // Вариант 2
//        System.out.print("Введите индекс первого суммируемого элемента: ");
//        while (!sc.hasNextInt()) {
//            System.out.print("Введите индекс первого суммируемого элемента: ");
//            sc.next();
//        }
//        int k = sc.nextInt();
//        System.out.println(sumElentov(k, array));
    }

    private static int sumElentov(int k, int[] mas) {
        if (k > mas.length - 3 || k < 0) {
            throw new ArrayIndexOutOfBoundsException("Ошибка!");
        } else {
            sum = mas[k];
            for (int i = k + 1; i < k + 3; i++) {
                sum += mas[i];
            }
        }
        return sum;
    }
}


