package Algorithmization_2.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *100 - 50);
        }
        System.out.println(Arrays.toString(array));

        int countOtr = 0;
        int countPol = 0;
        int countZer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countOtr++;
            } else if (array[i] > 0) {
                countPol++;
            } else countZer++;
        }
        System.out.println("Количество положительных: " + countPol + '\n' +
                "Количество отрицательных: " + countOtr + '\n' +
                "Количество нулевых: " + countZer);
    }
}
