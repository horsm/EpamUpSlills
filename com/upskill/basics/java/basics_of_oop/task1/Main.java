package com.upskill.basics.java.basics_of_oop.task1;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Новая директория");
        String fileName = "test";
        TextFile textFile = new TextFile(directory, fileName);
        String line1 = "Первая строка в файле\n";
        textFile.addText(line1);

        System.out.println("Файл создан: \"" + textFile.getFileName() + "\"");

        textFile.changeName("Новый test");
        System.out.println("Имя файла изменено на: \"" + textFile.getFileName() + "\"");

        System.out.println("\nTest: печать содержимого");
        textFile.printContent();

        System.out.println("\nTest: добавление дополнительной строки");
        String line2 = "Вторая строка в файле";
        textFile.addText(line2);
        textFile.printContent();

        System.out.println("\nTest: печать содержимого в директории.");
        for (File file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: создание нового файла и печать содержимого в директории.");
        File textFile2 = new TextFile(directory, "test2");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }

        System.out.println("\nTest: удаление файла и печать содержимого в директории.");
        directory.removeFile("Новый test");
        for (TextFile file : directory.getFiles()) {
            System.out.println(file);
        }
    }
}
