package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6FillMatrix {
    public static void main(String[] args) {
        int n = 10;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = n / 2; i < n; i++) {
            for (int j = i; j >= n - i - 1; j--) {
                matrix[i][j] = 1;
            }
        }


        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
