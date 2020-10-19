package com.upskill.basics.java.basics.cycles;

//7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.HashSet;

public class Task7Numbers {
    public static void main(String[] args) {
        int a = 516489;
        int b = 1234556;

        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);

        StringBuilder s1 = new StringBuilder().append(a);
        StringBuilder s2 = new StringBuilder().append(b);

        System.out.println("Цифры входящие в запись 2-х чисел: ");
        numbers(s1, s2);
    }

    private static void numbers(StringBuilder s1, StringBuilder s2) {
        HashSet<Character> dataHashset = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dataHashset.add(s1.charAt(i));
                }
            }
        }
        System.out.println(dataHashset.toString());
    }
}
