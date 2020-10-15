package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

//  14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

import java.util.Random;

public class Task14OneZero {
    static int m = 5;
    static int n = 6;
    static int[][] matrix = new int[m][n];

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        printMatrix();
        System.out.println("Новый массив: ");

        if (n > m + 1) {
            n = m + 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                while (sumElements(j) < j) {
                    int rand = random.nextInt(m);
                    if (matrix[rand][j] != 1) {
                        matrix[rand][j] = 1;
                    }
                }
            }
        }
        printMatrix();
    }

    private static void printMatrix() {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    private static int sumElements(int i) {
        int sum = 0;
        for (int j = 0; j < m; j++) {
            sum += matrix[j][i];
        }
        return sum;
    }
}
