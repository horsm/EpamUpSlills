package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме.
// Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task16SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число n : ");
            sc.next();
        }
        int n = sc.nextInt();

        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (isContainsOddNumbers(getOddEvenNumbers(getNumber(i)), n)) {
                sum += i;
            }
        }
        System.out.println("Сумма " + n + "- значных чисел, содержащих только нечетные цифры = " + sum);
        System.out.println("Количество четных цифр в найденной сумме = " + (getNumber(sum).length - getOddEvenNumbers(getNumber(sum))));
    }

    // массив из чисел
    private static int[] getNumber(int number) {
        int[] array = new int[String.valueOf(number).length()];
        int i = 0;
        while (number > 0) {
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

    // количество нечетых элементов
    private static int getOddEvenNumbers(int[] arraySum) {
        int countOddNumbers = 0;
        for (int j : arraySum) {
            if (j % 2 != 0) {
                countOddNumbers++;
            }
        }
        return countOddNumbers;
    }

    // содержит ли число только нечетные числа
    private static boolean isContainsOddNumbers(int count, int n) {
        return count == n;
    }
}
