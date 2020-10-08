package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Сycles;

import java.util.Scanner;

public class Task_2_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число a: ");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Введите число b: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число b: ");
            sc.next();
        }
        int b = sc.nextInt();

        System.out.print("Введите число h: ");
        while (!sc.hasNextInt()) {
            System.out.print("Это не число! Введите число h: ");
            sc.next();
        }
        double h = sc.nextDouble();
        int x = a;

        while (x < b) {
            if (x <= 2) {
                System.out.println("При значении х = " + x + " f(x) = " + -x);
            } else {
                System.out.println("При значении х = " + x + " f(x) = " + x);
            }
            x += h;
        }
    }
}
