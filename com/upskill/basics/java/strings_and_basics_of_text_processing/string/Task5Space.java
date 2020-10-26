package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

// 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//    Крайние пробелы в строке удалить.

import java.util.ArrayList;

public class Task5Space {
    public static void main(String[] args) {
        String originalString = "   Привет    Привет Привет  2 3 88 ";
        String newString[] = originalString.split(" ");
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("Исходная строка: |" + originalString + "|");

        for (String s : newString) {
            if (!s.equals("")) {
                stringList.add(s);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringList.size() - 1; i++) {
            stringBuilder.append(stringList.get(i)).append(" ");
        }
        stringBuilder.append(stringList.get(stringList.size() - 1));

        System.out.println("Полученная строка: |" + stringBuilder.toString() + "|");
    }
}
