package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

//  13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Random;

public class TaskThirteenSortPillars {
    static int n = 5;
    static int m = 6;
    static Random random = new Random();

    public static void main(String[] args) {

        int[][] matrix = new int[n][m];

        fillArray(matrix);
        System.out.println("Массив:");
        printMatrix(matrix);

        System.out.println("Массив по возростанию столбцов:");
        sortByUp(matrix);
        printMatrix(matrix);

        System.out.println("Массив по убыванию столбцов:");
        sortByDown(matrix);
        printMatrix(matrix);
    }

    private static void fillArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
    }

    private static void sortByUp(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                for (int k = 0; k < matrix.length - 1; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                        flag = true;
                    }
                }
            }
        }
    }

    private static void sortByDown(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            int temp;
            while (flag) {
                flag = false;
                for (int k = 0; k < matrix.length - 1; k++) {
                    if (matrix[k][i] < matrix[k + 1][i]) {
                        temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                        flag = true;
                    }
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
