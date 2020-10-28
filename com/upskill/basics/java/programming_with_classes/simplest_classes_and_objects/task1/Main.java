package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task1;

// 1. Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число a: ");
            sc.next();
        }
        test1.setFirst(sc.nextInt());

        System.out.print("Введите число b: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число b: ");
            sc.next();
        }
        test1.setSecond(sc.nextInt());

        System.out.println("Первый элемент: " + test1.getFirst());
        System.out.println("Второй элемент: " +test1.getSecond());

        System.out.println("Сумма элементов: " + test1.findSum(test1.getFirst(), test1.getSecond()));

        System.out.println("Максимум из элементов: " + test1.findMax(test1.getFirst(), test1.getSecond()));
    }
}
