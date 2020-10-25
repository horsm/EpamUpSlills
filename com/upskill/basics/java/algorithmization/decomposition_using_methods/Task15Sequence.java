package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 15. Найти все натуральные n-значные числа,
//     цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
//     Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task15Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число n : ");
            sc.next();
        }
        int n = sc.nextInt();

        for (int i = (int) Math.pow(10, n-1); i < Math.pow(10, n); i++) {
            if (isIncreases(getNumber(i))) {
                System.out.println(i);
            }
        }
    }
        // является ли массив возростающей последовательностью
    private static boolean isIncreases(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length-1; i++) {
            if (number[i] < number[i + 1]){
                sum++;
            }
        }
        return sum == number.length - 1;
    }

    private static int[] getNumber(int number) {
        // массив из чисел
        int[] array = new int[String.valueOf(number).length()];
        int i = 0;
        while(number > 0) {
            array[i++] = number % 10;
            number = number / 10;
        }

        // переворачиваем массив
        for (int j = 0; j < array.length / 2; j++) {
            int tmp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = tmp;
        }
        return array;
    }
}
