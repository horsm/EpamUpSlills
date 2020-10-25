package com.upskill.basics.java.strings_and_basics_of_text_processing;

//  3. В строке найти количество цифр.

import java.util.Scanner;

public class Task3NumberOfDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "Этот тект содержит 12345678 цифр. Нет, он содержит 9 цифр";
        System.out.println("Исходная строка: " + text);

        // Вариант 1
//        long count = text.codePoints().filter(Character::isDigit).count();
//        System.out.println("Тест содержит " + count + " цифр.");

        // Вариант 2
        System.out.println("Тест содержит " + getNumberDigits(text) + " цифр.");
    }

    public static int getNumberDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
