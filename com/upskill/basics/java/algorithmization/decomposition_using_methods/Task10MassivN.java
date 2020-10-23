package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 10. Дано натуральное число N.
// Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

import java.util.Arrays;
import java.util.Scanner;

public class Task10MassivN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число N: ");
            sc.next();
        }
        int number = sc.nextInt();

        System.out.println("Массив из чисел:" + Arrays.toString(getMassiv(number)));
    }

    private static int[] getMassiv(int number) {
        int lengt = String.valueOf(number).length();
        int[] array = new int[lengt];
        int i = 0;
        while(number > 0) {
            array[i++] = number % 10;
            number = number / 10;
        }
        return array;
    }
}
