package Basics_of_software_code_development_1.Linear;

public class Task_3_Formula {
    public static void main(String[] args) {
        double x = 40;
        double y = 50;

        System.out.println((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * (Math.tan(x*y)));
    }
}
