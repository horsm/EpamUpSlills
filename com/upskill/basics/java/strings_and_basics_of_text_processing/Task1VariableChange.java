package com.upskill.basics.java.strings_and_basics_of_text_processing;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Task1VariableChange {
    public static void main(String[] args) {

        String[] masVariable = {"camelCase", "snakeCase", "upperCamelCase", "mSomeCounter", "pupAge"};

        System.out.println("Массив переменных: " + Arrays.toString(masVariable));
        System.out.println("Новый массив: " + Arrays.toString(getNewMasVariable(masVariable)));
    }

    private static String[] getNewMasVariable(String[] masVariable) {
        String[] snakeCase = new String[masVariable.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < masVariable[i].length(); j++) {
                char simbol = masVariable[i].charAt(j);
                if (Character.isLowerCase(simbol)) {
                    stringBuilder.append(simbol);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(simbol));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
}
