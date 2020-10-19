package Java_Basics_UpSkill_Lab_1.Basics_of_software_code_development_1.Branching;

// 2. Найти max{min(a, b), min(c, d)}.

public class Task_2_Max_min {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 6;

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
