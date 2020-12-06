package com.upskill.basics.java.programming_with_classes.simplest_classes_and_objects.task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookHelp books = new BookHelp("Книжный магазин", new ArrayList<>());
        books.addBook("Букварь", "Надежда Жукова", "Эксмо",
                2016, 96, 11.99f, "Твердый переплет");
        books.addBook("1984", "Джордж Оруэлл", "АСТ",
                2015, 320, 11.73f, "Мягкая обложка");
        books.addBook("The One. Единственный", "Джон Маррс", "Эксмо",
                2020, 416, 17.60f, "Твердый переплет");
        books.addBook("Искусство любить", "Эрих Фромм", "АСТ",
                2016, 224, 11.38f, "Мягкая обложка");
        books.addBook("Внутри убийцы", "Майк Омер", "Эксмо",
                2019, 416, 17.59f, "Твердый переплет");

        System.out.println("Книги Эриха Фромма:");
        ArrayList<Book> autorsBook = books.authorsBooks("Эрих Фромм");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println();

        System.out.println("Книги издательства АСТ:");
        ArrayList<Book> publishersBook = books.publishersBook("АСТ");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println();

        System.out.println("Книги, выпущенные после 2019 года:");
        ArrayList<Book> releasedAfter = books.releasedAfter(2019);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}
