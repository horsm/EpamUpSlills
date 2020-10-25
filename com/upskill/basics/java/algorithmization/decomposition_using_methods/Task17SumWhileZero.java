package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 17. Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
// Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class Task17SumWhileZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число n : ");
            sc.next();
        }
        int n = sc.nextInt();

        System.out.println("Количество операций = " + getCount(n));

    }

    private static int getCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n - sumOfNumber(getNumber(n));
            count++;
        }
        return count;
    }
        // сумма чисел в массиве
    private static int sumOfNumber(int[] massNumber) {
        int sum = 0;
        for (int j : massNumber) {
            sum += j;
        }
        return sum;
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


}
