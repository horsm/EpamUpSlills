package com.upskill.basics.java.algorithmization.arrays_of_arrays;

//  10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10Positive {
    public static void main(String[] args) {

        int n = 3;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 20) - 10);
            }
        }
        System.out.println("Массив:");
        print_matrix(matrix);

        System.out.println("Положительные элементы главной диагонали:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j) && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }


    private static void print_matrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
