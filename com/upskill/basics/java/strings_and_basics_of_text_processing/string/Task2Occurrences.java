package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

//  2. Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class Task2Occurrences {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String originalString = sc.next();

        // Вариант 1
//        String value = originalString.replace("world", "letter");
//        System.out.println(value);

        // Вариант 2
        StringBuilder strBuilder = new StringBuilder();
        String text = "newsad word sdasdfsdafosoft word";
        System.out.println("Исходный текст: " + text);

        for (int i = 0; i < text.length(); i++) {
            if (i + 3 < text.length() && text.charAt(i) == 'w'
                                      && text.charAt(i + 1) == 'o'
                                      && text.charAt(i + 2) == 'r'
                                      && text.charAt(i + 3) == 'd') {
                strBuilder.append("letter");
                i += 3;
            } else {
                strBuilder.append(text.charAt(i));
            }
        }
        System.out.println("Новый текст: " + strBuilder.toString());
    }
}
