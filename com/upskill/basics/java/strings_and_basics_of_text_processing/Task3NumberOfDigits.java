package com.upskill.basics.java.strings_and_basics_of_text_processing;

//  3. В строке найти количество цифр.

import java.util.Scanner;

public class Task3NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.next();

      //  String text = "Этот тект содержит 12345678 цифр. Нет, он содержит 9 цифр";

        long count = text.codePoints().filter(Character::isDigit).count();
        System.out.println("Тест содержит " + count + " цифр.");

    }
}
