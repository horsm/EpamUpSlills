package com.upskill.basics.java.strings_and_basics_of_text_processing.regular_expressions;

/* 1. Cоздать приложение, разбирающее текст (текст хранится в строке)
    и позволяющее выполнять с текстом три различных операции:
    отсортировать абзацы по количеству предложений;
    в каждом предложении отсортировать слова по длине;
    отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
    а в случае равенства – по алфавиту.
 */

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String text = "1. Это первый абзац, содержит одно предложение.\n" +
                "2. Это второй абзац. Он длиньше первого. Содержит 3 предложения.\n" +
                "3. Это третий абзац. Содержит два предложения. \n" +
                "4. ";

        String commands = "Выберите команду:\n" +
                "1 - отсортировать абзацы по количеству предложений.\n" +
                "2 - отсортировать каждое предложения по длине слова. \n" +
                "3 - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.\n" +
                "0 - завершение программы.";

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        System.out.println(text);
        System.out.println();
        System.out.println(commands);
        System.out.println();

        while (!choice.equalsIgnoreCase("0")) {
            System.out.print("Введите команду: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1" -> sortParagraphs(text);
                case "2" -> sortWords(text);
                case "3" -> sortLexemes(text);
                case "0" -> System.out.println("\nЗавершение программы.");
                default -> System.out.println("Неверная команда. Повторите ввод команды снова.\n");
            }
        }
    }

    private static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }


    private static void sortParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }

        //вывод от самого короткого абазаца до самого длинного
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    private static void sortWords(String text) {
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                //сортировка слов
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                //вывод слов
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void sortLexemes(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите символ для сортировки лексем по убыванию: ");
        String letter = reader.readLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                //сортировка лексем
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) { //считаем количество вхождений
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {   //считаем количество вхождений следующего символа
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {   //сравниваем количесво вхождений
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) { //если количество вхождений равно, сортировка по алфавиту
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }

                //вывод слов
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
