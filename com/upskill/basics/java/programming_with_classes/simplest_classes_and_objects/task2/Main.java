package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task2;

// 2. Создйте класс Test2 двумя переменными.
// Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test2 test22 = new Test2(0, 0);

        System.out.println("Первый элемент: " + test2.getFirst());
        System.out.println("Второй элемент: " + test2.getSecond());

        System.out.println("Первый элемент: " + test22.getFirst());
        System.out.println("Второй элемент: " + test22.getSecond());

    }
}
