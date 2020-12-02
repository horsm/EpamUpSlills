package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите минимальное значение счетчика: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите минимальное значение счетчика: ");
            sc.next();
        }
        counter.setMinValue(sc.nextInt());

        System.out.print("Введите максимальное значение счетчика: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите максимальное значение счетчика: ");
            sc.next();
        }
        counter.setMaxValue(sc.nextInt());


        System.out.print("Введите значение счетчика: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите значение счетчика: ");
            sc.next();
        }

        counter.setCurrentValue(sc.nextInt());
        int counterNew = counter.getCurrentValue();

        System.out.println("Текущее значение счетчика -> " + counter.getCurrentValue());

        System.out.println("--- Метод увеличения ---");
        for (int i = counter.getCurrentValue(); i < counter.getMaxValue() + 1; i++) {
            System.out.println("Текущее значение счетчика -> " + (counter.increaseByOne() - 1));
        }

        System.out.println("--- Метод уменьшения ---");
        counter.setCurrentValue(counterNew);
        for (int i = counter.getCurrentValue(); i >= counter.getMinValue(); i--) {
            System.out.println("Текущее значение счетчика -> " + (counter.decreaseByOne() + 1));
        }

        System.out.println();
        System.out.println("Инициализация через конструктор");
        Counter counter2 = new Counter(3, 0, 15);

        counterNew = counter2.getCurrentValue();
        System.out.println("Текущее значение счетчика -> " + counter2.getCurrentValue());

        System.out.println("--- Метод увеличения ---");
        for (int i = counter2.getCurrentValue(); i < counter2.getMaxValue() + 1; i++) {
            System.out.println("Текущее значение счетчика -> " + (counter2.increaseByOne() - 1));
        }

        System.out.println("--- Метод уменьшения ---");
        counter2.setCurrentValue(counterNew);
        for (int i = counter2.getCurrentValue(); i >= counter2.getMinValue(); i--) {
            System.out.println("Текущее значение счетчика -> " + (counter2.decreaseByOne() + 1));
        }
    }
}
