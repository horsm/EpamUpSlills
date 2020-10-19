package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_sum_of_element {
    public static void main(String[] args) {

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


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            if (array[i] % k == 0)
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
    }

}
