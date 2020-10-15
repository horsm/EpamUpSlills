package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5FillMatrix {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-i; j++) {
                matrix[i][j] = count;
            }
            count++;
        }

        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
