package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5Print {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
