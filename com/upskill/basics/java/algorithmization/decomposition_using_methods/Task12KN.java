package com.upskill.basics.java.algorithmization.decomposition_using_methods;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//    элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12KN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число K: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число K:");
            sc.next();
        }
        int k = sc.nextInt();

        System.out.print("Введите число N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число N:");
            sc.next();
        }
        int n = sc.nextInt();

        System.out.println("Полученный массив: " + Arrays.toString(getMassiv(k , n)));
    }

    private static int [] getMassiv(int k, int n) {
        ArrayList<Integer> arrayList = new ArrayList();
        while (k >= n) {
            k = k - n;
            arrayList.add(n);
        }
        if (k != 0)
            arrayList.add(k);

        // list to array
        int[] a = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
            a[i] = arrayList.get(i);

        return a;
    }
}
