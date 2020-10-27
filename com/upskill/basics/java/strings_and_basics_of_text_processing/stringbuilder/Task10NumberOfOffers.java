package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 10. Строка X состоит из нескольких предложений,
//     каждое из которых кончается точкой, восклицательным или вопросительным знаком.
//     Определить количество предложений в строке X.

public class Task10NumberOfOffers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "Afasdf! Asdf. Asdf, adsf! Sdafsdfa? Adfdsf?";
        System.out.println("Исходная строка: " + text);

        int count = 0;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Количество предложений: " + count);
    }
}
