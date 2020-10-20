package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

//3. Дан массив действительных чисел, размерность которого N.
//   Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3Count {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil((random.nextDouble()  - 0.5)* 10000) / 100;
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        int countOtr = 0;
        int countPol = 0;
        int countZer = 0;

        for (double number : array) {
            if (number < 0) {
                countOtr++;
            } else if (number > 0) {
                countPol++;
            } else countZer++;
        }
        System.out.println("Количество положительных: " + countPol + '\n' +
                "Количество отрицательных: " + countOtr + '\n' +
                "Количество нулевых: " + countZer);
    }
}
