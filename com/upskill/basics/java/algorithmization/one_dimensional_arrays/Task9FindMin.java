package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//    Если таких чисел несколько, то определить наименьшее из них.

import java.util.Arrays;

public class Task9FindMin {
    public static void main(String[] args) {

        int[] array = {2, 0, 0, 1, 1, 0, 1, 0, 1};
        System.out.println("Первичный массив:");
        System.out.println(Arrays.toString(array));

        int count1 = 0;
        int count2 = 0;
        int popular1;
        int popular2 = 0;

        for (int i = 0; i < array.length; i++) {
            popular1 = array[i];
            count1 = 0;

            for (int j = i + 1; j < array.length; j++) {
                if (popular1 == array[j]) count1++;
            }

            if (count1 > count2) {
                popular2 = popular1;
                count2 = count1;
            } else if (count1 == count2) {
                popular2 = Math.min(popular2, popular1);
            }
        }
        System.out.println("Наиболее часто встречающееся минимальное число = " + popular2 +
                            ". Встречается " + (count2 +1) + " раз(а)");
    }
}
