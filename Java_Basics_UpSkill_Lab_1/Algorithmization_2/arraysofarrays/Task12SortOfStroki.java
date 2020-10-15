package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12SortOfStroki {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;

        int[][] matrix = new int[n][m];

        fill_array(matrix);
        System.out.println("Массив:");
        print_matrix(matrix);

        System.out.println("Массив по возростанию строк:");
        sort_by_up(matrix);
        print_matrix(matrix);

        System.out.println("Массив по убыванию строк:");
        sort_by_down(matrix);
        print_matrix(matrix);
    }

    private static void fill_array(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }
    }

    private static void sort_by_up(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] > matrix[i][j + 1]) {
                        isSorted = false;

                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
                }
            }
        }
    }

    private static void sort_by_down(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSorted = false;

                        buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;
                    }
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
