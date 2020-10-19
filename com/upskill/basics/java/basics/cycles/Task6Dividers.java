package com.upskill.basics.java.basics.cycles;

import java.util.Scanner;

public class Task6Dividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число m: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число m: ");
            sc.next();
        }
        int m = sc.nextInt();

        System.out.print("Введите число n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число n: ");
            sc.next();
        }
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for(int j = 2; j < i; j++){
                if ((i % j) == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}
