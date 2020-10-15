package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

public class Task15MaxReplace {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];

        fill_array(matrix);
        System.out.println("Массив:");
        print_matrix(matrix);

        int max = 0;

        max = getMax(matrix, max);

        replace_odd(matrix, max);

        System.out.println(max);

        System.out.println("Новый массив:");
        print_matrix(matrix);
    }

    private static void replace_odd(int[][] matrix, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
    }

    private static int getMax(int[][] matrix, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    private static void fill_array(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
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
