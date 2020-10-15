package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

// 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им
// позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task8Replace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите размерность массива: ");
            sc.next();
        }
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println("Первоночальный массив:");
        print_matrix(matrix);

        System.out.print("Введите столбец 1: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите столбец 1: ");
            sc.next();
        }

        int a = sc.nextInt();

        System.out.print("Введите столбец 2: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите столбец 2: ");
            sc.next();
        }
        int b = sc.nextInt();

        int s;
        for (int i = 0; i < matrix.length; i++) {
            try {
                s = matrix[i][b];
                matrix[i][b] = matrix[i][a];
                matrix[i][a] = s;
            } catch (Exception exc) {
                System.out.println("Не верно введен номер столбца!");
            }
        }

        System.out.println("Новый массив:");
        print_matrix(matrix);
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
