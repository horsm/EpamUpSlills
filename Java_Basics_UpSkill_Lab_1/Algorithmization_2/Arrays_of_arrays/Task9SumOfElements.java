package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//    Определить, какой столбец содержит максимальную сумму.


public class Task9SumOfElements {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }
        System.out.println("Массив:");
        print_matrix(matrix);


        int max = 0;
        int sum = 0;
        int number = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                number = j;
            }
            sum = 0;
        }
        System.out.println("Максимальная сумма в " + (number +1)+ " столбце равна " + max);
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

