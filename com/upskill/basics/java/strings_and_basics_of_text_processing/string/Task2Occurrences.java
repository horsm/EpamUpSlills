package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

//  2. Замените в строке все вхождения 'word' на 'letter'.

import java.util.Scanner;

public class Task2Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String originalString = sc.next();

        String value = originalString.replace("world", "letter");
        System.out.println(value);
    }
}
