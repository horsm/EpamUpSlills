package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task_2_diogonal {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;

        Matrix matrica = new Matrix();

        int[][] matrix = matrica.fill_matrix(n, m);

        System.out.println("Главная диогональ:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Побочная диогональ:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix[i].length - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Матрица: ");

        matrica.print_matrix(matrix);
    }
}
