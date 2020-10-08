package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Сycles;

import java.util.Scanner;

public class Task_1_count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число b: ");
            sc.next();
        }
        int b = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= b; i++) count += i;
        System.out.println(count);


    }
}
