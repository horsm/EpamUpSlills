package com.upskill.basics.java.algorithmization.decomposition_using_methods;

// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

import java.util.Scanner;

public class Task3Hexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону а: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите сторону а: ");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.println("Площадь шестиугольника со стороной " + a + " = " + 3 * Math.sqrt(3) * a * a / 2);
    }
}
