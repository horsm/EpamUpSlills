package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

// 1. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число b: ");
            sc.next();
        }
        int b = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= b; i++) count += i;
        System.out.println(count);


    }
}
