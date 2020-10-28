package com.upskill.basics.java.basics.cycles;

import java.util.Scanner;

public class Task2Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Это не число! Введите число a: ");
            sc.next();
        }
        double x = sc.nextDouble();

        System.out.print("Введите число b: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Это не число! Введите число b: ");
            sc.next();
        }
        double b = sc.nextDouble();

        System.out.print("Введите число h: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Это не число! Введите число h: ");
            sc.next();
        }
        double h = sc.nextDouble();

        while (x <= b) {
            if (x <= 2) {
                System.out.println("При значении х = " + x + " f(x) = " + -x);
            } else {
                System.out.println("При значении х = " + x + " f(x) = " + x);
            }
            x += h;
        }
    }
}
