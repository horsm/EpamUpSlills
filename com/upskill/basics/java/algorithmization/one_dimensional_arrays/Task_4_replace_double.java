package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4_replace_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        double[] array = new double[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(rand.nextDouble() * 10000) / 100;
        }
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        double a = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = a;

        System.out.println("Массив с поменянными элементами: ");
        System.out.println(Arrays.toString(array));
    }
}
