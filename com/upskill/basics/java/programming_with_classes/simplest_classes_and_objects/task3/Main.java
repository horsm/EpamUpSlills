package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task3;

// 3. Создайте класс с именем Student,
// содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Иванов С.А.", 101, new int[]{7, 8, 9, 7, 8});
        students[1] = new Student("Петров Е.К.", 102, new int[]{8, 8, 9, 7, 8});
        students[2] = new Student("Зубор Н.В", 103, new int[]{9, 8, 9, 10, 8});
        students[3] = new Student("Окунев К.В.", 104, new int[]{10, 9, 9, 10, 9});
        students[4] = new Student("Новиков Е.С.", 103, new int[]{5, 6, 8, 7, 8});
        students[5] = new Student("Урбан В.С.", 102, new int[]{7, 8, 9, 7, 8});
        students[6] = new Student("Петрова У.М.", 101, new int[]{7, 8, 9, 7, 8});
        students[7] = new Student("Никифорова Ф.В.", 104, new int[]{9, 9, 9, 9, 9});
        students[8] = new Student("Малец Н.Р.", 105, new int[]{7, 8, 9, 7, 8});
        students[9] = new Student("Вовочкин У.З.", 102, new int[]{10, 10, 10, 10, 10});

        int count = 0;

        for (Student student : students) {
            for (int j = 0; j < student.getPerformance().length; j++) {
                if (student.getPerformance()[j] >= 9) {
                    count++;
                }
            }
            if (count == 5) {
                System.out.println("Лучший студент: " + student.getSurname() + " из группы № " + student.getGroupNumber());
                count = 0;
            } else {
                count = 0;
            }
        }
    }


}
