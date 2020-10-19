package com.upskill.basics.java.algorithmization.arraysofarrays;

// 7. Сформировать квадратную матрицу порядка N по правилу:

public class Task7Sin {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.ceil(Math.sin((i * i - j * j) / n)*10000)/10000;
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        System.out.println("Количество положительных элементов: " + count);
        System.out.println();

        for (double[] matrix1 : matrix) {
            for (double i : matrix1) {
                System.out.print(i + "\t\t");
            }
            System.out.println();
        }
    }
}
