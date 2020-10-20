package com.upskill.basics.java.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

public class Task10DeleteEveryTwo {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(getLessArray(a)));
    }

    public static int[] getLessArray(int[] data) {
        if (data.length < 2)
            return data;

        int count = 1;
        if (data.length > 2) {
            for (int i = 2; i < data.length; i += 2) {
                data[count] = data[i];
                count++;
            }
            if (data.length % 2 == 0) {
                data = Arrays.copyOf(data, data.length / 2);
            } else {
                data = Arrays.copyOf(data, data.length / 2 + 1);
            }
        } else {
            data = Arrays.copyOf(data, data.length / 2);
        }
        return data;
    }
}
