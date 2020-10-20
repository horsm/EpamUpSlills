package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
//    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

import java.util.Arrays;

public class Task8DeleteMin {
    public static void main(String[] args) {

        int[] array = {0, 2, 3, 0, 1, 0, 7, 8, 1};

        System.out.println("Первичный массив:");
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        int count = 0;
        for (int value : array) {
            if (min == value) {
                count++;
            }
        }
        System.out.println("count  = " + count);

        int nElems = array.length;
        System.out.println("min = " + min);
        int i;
        for (i = 0; i < array.length; i++)
            if (array[i] == min) {
                for (int k = i; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
            }
        nElems = nElems - count;    //уменьшение размера

        System.out.println("Вторичный массив:");
        for (int j = 0; j < nElems; j++)         //вывод элементов
            System.out.print(array[j] + " ");
        System.out.println("");


    }
}
