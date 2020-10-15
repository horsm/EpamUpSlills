package Java_Basics_UpSkill_Lab_1.Algorithmization_2.Arrays_of_arrays;

// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3Print {
    public static void main(String[] args) {
        int n = 9;
        int m = 10;

        int k = 1; // строка
        int p = 2; // столбец

        Matrix matrica = new Matrix();

        int[][] matrix = matrica.fill_matrix(n, m);

        //вывод к-ой строки
        System.out.println("Вывод " + k + "-ой строки: ");
        for (int i = 0; i < matrix[k].length; i++) {
            System.out.print(matrix[k][i] + "\t");
        }
        System.out.println();

        //вывод р-ого солбца
        System.out.println("Вывод " + p + "-ого столбца: ");
        for (int[] matrix1 : matrix) {
            System.out.print(matrix1[p] + "\t");
        }
        System.out.println();
        System.out.println();

        matrica.print_matrix(matrix);
    }
}
