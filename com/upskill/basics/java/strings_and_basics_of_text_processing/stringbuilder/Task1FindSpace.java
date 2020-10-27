package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1FindSpace {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        ArrayList<Integer> list = new ArrayList<>();

        String text = "1 2  3   4    5     8        ";
        System.out.println("Исходный текст: " + text);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            } else {
                list.add(count);
                count = 0;
            }
        }
        list.add(count);

        System.out.println("Найдите наибольшее количество подряд идущих пробелов = " + Collections.max(list));
    }
}
