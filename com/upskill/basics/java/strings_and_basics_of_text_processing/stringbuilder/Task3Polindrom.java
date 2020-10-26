package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 3. Проверить, является ли заданное слово палиндромом.

import java.util.Scanner;

public class Task3Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String originalString = sc.next();
        StringBuilder stringBuilder = new StringBuilder(originalString);

        if (stringBuilder.toString().equals(stringBuilder.reverse().toString())){
            System.out.println("Слово " + originalString + " является палиндромом");
        } else
            System.out.println("Слово " + originalString + " не является палиндромом");

    }
}
