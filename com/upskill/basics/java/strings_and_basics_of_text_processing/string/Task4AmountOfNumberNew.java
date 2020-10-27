package com.upskill.basics.java.strings_and_basics_of_text_processing.string;

// 4. В строке найти количество чисел.

public class Task4AmountOfNumberNew {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "Этот тект 654содержит 12345678 цифр. Нет, 33 он содержит 9 цифр 987 93 qwer";
        System.out.println("Исходная строка: " + text);

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                if (i == text.length() - 1 || !Character.isDigit(text.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        System.out.println("Количество чисел в строке: " + counter);
    }
}
