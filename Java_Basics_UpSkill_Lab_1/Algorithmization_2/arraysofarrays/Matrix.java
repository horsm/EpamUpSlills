package Java_Basics_UpSkill_Lab_1.Algorithmization_2.arraysofarrays;

// создание и печать матрицы

class Matrix {

    int[][] fill_matrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((int) (Math.random() * 100));
            }
        }
        return matrix;
    }


    void print_matrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int i : matrix1) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
