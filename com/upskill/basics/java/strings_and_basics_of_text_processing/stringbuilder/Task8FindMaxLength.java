package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 8. Вводится строка слов, разделенных пробелами.
//    Найти самое длинное слово и вывести его на экран.
//    Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task8FindMaxLength {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "Хотя отразившаяся в зеркале заспанная, подслеповатая и довольно оплешивевшая фигура...";
        System.out.println("Исходная строка: " + text);

        String[] masSlov = text.split(" ");
        int maxLength = 0;
        String stringWithMaxLength = "";

        for (int i = 0; i < masSlov.length; i++) {
            if (masSlov[i].length() > maxLength) {
                maxLength = masSlov[i].length();
                stringWithMaxLength = masSlov[i];
            }
        }
        System.out.println("Самое длинное слово: " + stringWithMaxLength);

    }
}
