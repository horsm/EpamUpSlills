package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1Matrix {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;

        Matrix matrica = new Matrix();

        int[][] matrix = matrica.fill_matrix(n, m);

        System.out.println("Номера столбцов:");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                if (i % 2 != 0) {
                    System.out.print(i + "  ");
                }
            }
        }
        System.out.println();

        matrica.print_matrix(matrix);


    }
}
