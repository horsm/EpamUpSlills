package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.cycles;

import java.util.HashSet;

public class Task_7_numbers {
    public static void main(String[] args) {
        int a = 516489;
        int b = 1234556;

        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);

        StringBuilder s1 = getStringBuilder(a);
        StringBuilder s2 = getStringBuilder(b);

        System.out.println("Цифры входящие в запись 2-х чисел: ");
        numbers(s1, s2);
    }

    private static void numbers(StringBuilder s1, StringBuilder s2) {
        HashSet<Character> data_hashset = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    data_hashset.add(s1.charAt(i));
                }
            }
        }
        System.out.println(data_hashset.toString());
    }

    private static StringBuilder getStringBuilder(int a) {
        StringBuilder s = new StringBuilder();
        while (a > 0) {
            s.insert(0, a % 10);
            a = a / 10;
        }
        return s;
    }
}
