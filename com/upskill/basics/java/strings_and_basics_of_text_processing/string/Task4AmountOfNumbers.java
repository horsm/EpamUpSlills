package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

// 4. В строке найти количество чисел.

import java.util.ArrayList;
import java.util.Scanner;

public class Task4AmountOfNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "Этот тект 654содержит 12345678 цифр. Нет, 33 он содержит 9 цифр 987 ";
        System.out.println("Исходная строка: " + text);

        System.out.println("Количество чисел в строке: " + getListOfNumbers(text).size());
    }

    // получаем лист чисел
    private static ArrayList<String> getListOfNumbers(String text) {
        String[] newString = makeNewString(text).split(" ");
        ArrayList<String> stringList = new ArrayList<>();
        for (String s : newString) {
            if (!s.equals("")) {
                stringList.add(s);
            }
        }
        return stringList;
    }

    // создание новой строки из цифр и пробелов
    public static String makeNewString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            } else
                stringBuilder.append(" ");
        }
        return String.valueOf(stringBuilder);
    }
}
