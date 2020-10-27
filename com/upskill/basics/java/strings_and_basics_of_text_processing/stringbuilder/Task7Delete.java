package com.upskill.basics.java.strings_and_basics_of_text_processing.stringbuilder;

// 7. Вводится строка.
//    Требуется удалить из нее повторяющиеся символы и все пробелы.
//    Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class Task7Delete {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String stroka = sc.next();

        String stroka = "abc cde def ff";
        System.out.println("Исходная строка: " + stroka);

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < stroka.length(); i++) {
            int count = 0;
            if (stroka.charAt(i) != ' ') {
                for (int j = i + 1; j < stroka.length(); j++) {
                    if (stroka.charAt(i) == stroka.charAt(j)) {
                        count++;
                    }
                }
                if (count == 0) {
                    newString.append(stroka.charAt(i));
                }
                count = 0;
            }
        }
        System.out.println("Новая строка: " + newString.toString());
    }
}
