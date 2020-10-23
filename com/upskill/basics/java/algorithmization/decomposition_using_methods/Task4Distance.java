package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 4. На плоскости заданы своими координатами n точек.
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.

import java.util.Random;
import java.util.Scanner;

public class Task4Distance {
    static Random random = new Random();

    public static void main(String[] args) {
        double dist = 0;
        double max = dist;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();


        int[][] matrix = fillMatrix(n);
        printMatrix(matrix);

        for (int j = 0; j < matrix[0].length; j++) {
            for (int k = j; k < matrix[0].length - 1; k++) {
                dist = Math.sqrt((matrix[0][j] - matrix[0][k + 1]) * (matrix[0][j] - matrix[0][k + 1]) +
                        (matrix[1][j] - matrix[1][k + 1]) * (matrix[1][j] - matrix[1][k + 1]));
                if (dist > max) {
                    max = dist;
                    x1 = matrix[0][j];
                    y1 = matrix[1][j];

                    x2 = matrix[0][k + 1];
                    y2 = matrix[1][k + 1];
                }
               // System.out.println(dist);
            }
        }
        System.out.println("Максимальное расстояние " + max + " между точками с координатами [" +
                x1 + ", " + y1 + "] и [" + x2 + ", " + y2 + "]");
    }

    static int[][] fillMatrix(int m) {
        int[][] matrix = new int[2][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
