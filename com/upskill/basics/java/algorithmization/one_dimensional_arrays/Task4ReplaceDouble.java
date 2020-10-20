package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4ReplaceDouble {
    public static void main(String[] args) {

        int indexMax = 0;
        int indexMin = 0;
        double replace;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        double[] array = new double[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((random.nextDouble()  - 0.5)* 10000) / 100;
        }
        double min = array[0];
        double max = array[0];
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        replace = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = replace;

        System.out.println("Массив с поменянными элементами: ");
        System.out.println(Arrays.toString(array));
    }
}
