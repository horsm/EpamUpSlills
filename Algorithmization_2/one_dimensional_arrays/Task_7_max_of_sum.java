package Algorithmization_2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task_7_max_of_sum {
    public static void main(String[] args) {
        int n = 10;

        double[] array = new double[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(rand.nextDouble() * 10000 - 5000) / 100;
        }
        double sum;
        double max = array[0] + array[array.length - 1];
        System.out.println("Первоночальный массив:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            sum = array[i] + array[array.length -1 - i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);

    }
}
