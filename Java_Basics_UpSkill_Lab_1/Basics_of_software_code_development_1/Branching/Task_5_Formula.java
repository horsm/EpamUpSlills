package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Branching;

public class Task_5_Formula {
    public static void main(String[] args) {
        double x = 1;

        if (x <= 3) {
            System.out.println(x * x - 3 * x + 9);
        } else {
            System.out.println(1 / (x * x * x + 6));
        }
    }
}
