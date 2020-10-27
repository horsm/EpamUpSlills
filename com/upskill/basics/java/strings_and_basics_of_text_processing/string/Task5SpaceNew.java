package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

// 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//    Крайние пробелы в строке удалить.

public class Task5SpaceNew {
    public static void main(String[] args) {
        String originalString = "   Привет    Привет Привет  2 3 88 ";
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Исходная строка: |" + originalString + "|");

        StringBuilder strBuilder = new StringBuilder();
        String line = originalString.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        System.out.println(strBuilder.toString());
    }
}
