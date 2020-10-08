package Basics_of_software_code_development_1.Branching;

public class Task_1_Triangle {
    public static void main(String[] args) {
        int a = -10;
        int b = 45;
        int c = 180 - a - b;

        if (((a > 0) && (a < 180) && (b > 0) && (b < 180) && (c > 0))) {
            if ((a == 90) || (b == 90) | (c == 90)) {
                System.out.println("Треугольник прямоугольный");
            } else if ((a > 90) || (b > 90) || (c > 90)) {
                System.out.println("Треугольник тупоугольный");
            } else {
                System.out.println("Треугольник остроугольный");
            }
        } else {
            System.out.println("Такого треугольника не существует!");
        }
    }
}
