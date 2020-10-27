package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//    Учитывать только английские буквы.

public class Task9FindBigAndLittle {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String text = sc.next();

        String text = "AAA bbb bb CC DD E ййй";
        System.out.println("Исходная строка: " + text);
        int countLittle = 0;
        int countBig = 0;

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 'a') && (text.charAt(i) <= 'z')) {
                countLittle++;
            }
            if ((text.charAt(i) >= 'A') && (text.charAt(i) <= 'Z')) {
                countBig++;
            }
        }
        System.out.println("Количество строчных (маленьких) в введенной строке = " + countLittle +
               ".\nКоличество прописных (больших) букв в введенной строке = " + countBig);
    }
}
