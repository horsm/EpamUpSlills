package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4FillMatrix {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = count++;
                } else {
                    matrix[i][j] = n--;
                }
            }
            count = 1;
            n = 10;
        }

        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}