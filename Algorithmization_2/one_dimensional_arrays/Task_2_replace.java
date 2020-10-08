package Algorithmization_2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        double[] array = new double[n];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.ceil(rand.nextDouble() * 10000) / 100;
        }
        System.out.println("Первоночальный массив:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.print("Введите число Z: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число Z: ");
            sc.next();
        }
        double z = sc.nextDouble();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен: " + count);
    }
}
