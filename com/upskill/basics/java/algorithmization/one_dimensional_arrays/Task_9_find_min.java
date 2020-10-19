package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

public class Task_9_find_min {
    public static void main(String[] args) {
        int num = 0;
        int numB = 0;
        int numMax = 0;
        int c = 0;
        int max,min;

        int[] a = {0, 2, 2, 0, 1, 0, 1, 2, 1};
        int[] b = new int[a.length];
        int[] d = new int[a.length];
        System.out.println("Первичный массив:");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) num++; // Находим сколько раз каждое число находится в массиве
            }
            b[i] = num;
            num = 0; // Заполняем массив b этими значениями
        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1) numB++; // Если весь массив равен единице, то все элементы различны
        }
        if (numB == b.length)
            System.out.println("Повторяющиеся элементы отсутствуют");

        else {
            max = b[0];
            for (int i = 0; i < b.length; i++) {
                if (max < b[i]) {
                    max = b[i];
                    c = i;
                } // Находим максимальное количество повторяющихся элементов
            }
            for (int i = 0; i < b.length; i++) {
                if (max == b[i]) {
                    numMax++;
                }// Находим количество максимально повторяющихся элементов
            }
            if (numMax == 1) { // Если их количество равно 1 ,то одно число повторяется максимальное количество раз
                System.out.println("Число " + a[c] + " встречается " + max + " раза"); // Выводим это число
            } else {
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == max) {
                        d[i] = a[i];
                    }// Если же таких элементов несколько ,то заполняем новый массив D этими элементами
                }
                System.out.println(Arrays.toString(d));

                min = d[0];
                for (int i = 0; i < d.length; i++) {
                    if (min > d[i] && d[i] != 0) {
                        min = d[i];
                    }// Находим в массиве D минимальное число
                }
                System.out.println("Число " + min + " встречается " + max + " раза"); // Выводим минимальное число в массиве ,которое встречается максимальное количество раз

            }
        }
    }
}
