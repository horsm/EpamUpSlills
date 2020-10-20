package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 5. Составить программу, которая в массиве A[N] находит второе по величине число
//    (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5NearlyMax {
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
            array[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int max = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < max) {
                System.out.println("Почти максимальное число = " + array[i]);
                break;
            }
        }


    }
}
