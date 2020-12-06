package com.upskill.basics.java.programming_with_classes.aggregation_and_composition.task1;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {
        Word word = new Word("Гимн СССР");

        String line1 = "Союз нерушимый республик свободных\n" +
                "Сплотила навеки Великая Русь.\n" +
                "Да здравствует созданный волей народов,\n" +
                "Единый, могучий Советский Союз!\n";

        Sentence sentence = new Sentence(line1);
        Text poem = new Text(word, sentence);

        String line2 = "Славься, Отечество наше свободное,\n" +
                "Дружбы народов надёжный оплот!\n" +
                "Знамя советское, знамя народное\n" +
                "Пусть от победы к победе ведёт!\n";

        String line3 = "Сквозь грозы сияло нам солнце свободы,\n" +
                "И Ленин великий нам путь озарил.\n" +
                "Нас вырастил Сталин — на верность народу,\n" +
                "На труд и на подвиги нас вдохновил.\n";

        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));

        poem.printText();
        poem.printHeading();
    }
}
