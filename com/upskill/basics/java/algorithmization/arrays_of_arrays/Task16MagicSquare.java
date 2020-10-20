package com.upskill.basics.java.algorithmization.arrays_of_arrays;

// 16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу, каждой строке
// и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.

public class Task16MagicSquare {
    public static void main(String[] args) {
        int n = 5;
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int currRow;
        int currCol;

        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            currRow = row;
            currCol = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = currRow + 1;
                column = currCol;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int[] ints : magicSquare) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
