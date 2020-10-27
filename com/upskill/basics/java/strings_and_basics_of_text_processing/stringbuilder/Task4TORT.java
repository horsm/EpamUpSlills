package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4TORT {
    public static void main(String[] args) {
        String stroka = "информатика";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stroka.charAt(7)).append(stroka.charAt(3)).append(stroka.charAt(4)).append(stroka.charAt(7));
        System.out.println("Новое слово: " + stringBuilder);
    }
}
