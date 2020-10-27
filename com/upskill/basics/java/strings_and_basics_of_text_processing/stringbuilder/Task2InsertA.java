package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2InsertA {
    public static void main(String[] args) {
        String stroka = "asdfasdf aa bb a a a";
        System.out.println("Исходная строка: " + stroka);
        StringBuilder newStroka = new StringBuilder();

        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == 'a') {
                newStroka.append('a');
                newStroka.append('b');
            } else {
                newStroka.append(stroka.charAt(i));
            }
        }
        System.out.println("Полученная строка: " + newStroka.toString());
    }
}
