package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task14Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число k: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число: ");
            sc.next();
        }
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i == Math.pow(getSumOfNumber(i), String.valueOf(i).length())){
                System.out.println("Число Армстронга: " + i);
            }
        }
    }

    private static int getSumOfNumber(int number) {
        int lengt = String.valueOf(number).length();
        int[] array = new int[lengt];
        int i = 0;
        int sum = 0;
        while(number > 0) {
            array[i++] = number % 10;
            number = number / 10;
        }
        for (int k : array) {
            sum += k;
        }
        return sum;
    }
}
