package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5FindA {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String stroka = sc.next();

        String stroka = "asdfasdf aa bb a a a  ha";
        System.out.println("Исходная строка: " + stroka);
        int count = 0;

        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Буква а встречается " + count + " раз.");

    }
}
