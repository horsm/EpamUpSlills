package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//     Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//     Для решения задачи использовать декомпозицию.

import java.math.BigInteger;
import java.util.Scanner;

public class Task13Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число N:");
            sc.next();
        }
        int n = sc.nextInt();

        for (int i = 2; i < 2 * n - 2; i++) {
            if (isNaturalNumber(i) && isNaturalNumber(i + 2)){
                System.out.println(i + "  " + (i + 2));
            }
        }
    }

    private static boolean isNaturalNumber(int i) {
        return BigInteger.valueOf(i).isProbablePrime((int) Math.log(i));
    }
}
