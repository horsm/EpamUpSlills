package com.upskill.basics.java.algorithmization.sorting;

// 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//    Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
//    при этом не используя дополнительный массив.

import java.util.*;

public class Task1AddMassiv {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Первый массив:");
        System.out.println(Arrays.toString(array));

        int[] arrayDop = new int[5];
        for (int i = 0; i < arrayDop.length; i++) {
            arrayDop[i] = random.nextInt(100);
        }
        System.out.println("Второй массив:");
        System.out.println(Arrays.toString(arrayDop));

        int k = 1;   // k должно быть меньше array.length

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            list.add(array[i]);
        }
        for (int j : arrayDop) {
            list.add(j);
        }
        for (int i = k + 1; i < array.length; i++) {
            list.add(array[i]);
        }
        array = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);

        System.out.println("Объединенный массив:");
        System.out.println(Arrays.toString(array));
    }
}
