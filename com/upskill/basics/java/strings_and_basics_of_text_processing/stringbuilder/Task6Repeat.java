package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 6. Из заданной строки получить новую, повторив каждый символ дважды.

import java.util.Scanner;

public class Task6Repeat {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String stroka = sc.next();

        String stroka = "abc def 123  456";
        System.out.println("Исходная строка: " + stroka);

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < stroka.length(); i++) {
            newString.append(stroka.charAt(i)).append(stroka.charAt(i));
        }
        System.out.println("Новая строка: " + newString.toString());
    }
}
